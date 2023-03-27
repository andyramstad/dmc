package dmc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import dmc.DMCConstants;
import dmc.model.GitHubEvent;

/**
 * DMCConsumerService consumes {@link GitHubEvent}s from Kafka
 */
@Service
public class DMCConsumer {

    private final Logger LOG = LoggerFactory.getLogger(DMCConsumer.class);

    /**
     * Consumes {@link GitHubEvent}
     * 
     * @param gitHubEvent the {@link GitHubEvent}
     */
    @KafkaListener(id = DMCConstants.ID, topics = DMCConstants.TOPIC, groupId = DMCConstants.GROUP_ID)
    public void listen(final GitHubEvent gitHubEvent) {
        try {
            LOG.info(String.format("GitHubEvent recieved -> %s", gitHubEvent));
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
    }
}