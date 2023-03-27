package dmc.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.Resource;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import dmc.DMCConstants;
import dmc.model.GitHubEvent;

/**
 * Produces {@link GitHubEvent} when app is started, sends them to kafka
 */
@Component
public class DMCProducer implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(DMCProducer.class);

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private final ObjectMapper mapper;

    @Value("classpath:2015-01-01-15.json")
    private Resource resource;
    private int success;
    private int total;
    private int failures;

    /**
     * Constructor
     * 
     * @param dmcProducerService the {@link DMCProducerService}
     */
    @Autowired
    public DMCProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
        this.mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Override
    public void run(final String... args) {

        try (Stream<String> stream = new BufferedReader(new InputStreamReader(resource.getInputStream())).lines()) {
            stream.forEach(jsonString -> {
                total++;
                try {
                    sendMessageToKafka(jsonString);
                    success++;
                } catch (Exception e) {
                    failures++;
                    LOG.error(e.getMessage(), e);
                }
            });
        } catch (IOException e) {
            LOG.error(e.getMessage(), e);
        }

        LOG.info(String.format("Total Number of JSON Objects read from file: %d", total));
        LOG.info(String.format("Total Number of successful messages sent to Kafka: %d", success));
        LOG.info(String.format("Total Number of failures sending to kafka: %d", failures));
    }

    private void sendMessageToKafka(final String jsonString) throws Exception {
        GitHubEvent gitHubEvent = mapper.readValue(jsonString, GitHubEvent.class);
        LOG.info(String.format("GitHubEvent sent -> %s", gitHubEvent.getId()));
        kafkaTemplate.send(DMCConstants.TOPIC, gitHubEvent);
    }
}