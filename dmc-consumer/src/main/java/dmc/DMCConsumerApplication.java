package dmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import dmc.model.GitHubEvent;

/**
 * DMCConsumerApplication Consumes {@link GitHubEvent}s from Kafka
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class DMCConsumerApplication {

    /**
     * Main
     * 
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(DMCConsumerApplication.class, args);
    }
}
