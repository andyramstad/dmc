package dmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import dmc.model.GitHubEvent;

/**
 * DMCProducerApplication Produces {@link GitHubEvent}s from a load file
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class DMCProducerApplication {

    /**
     * Main
     * 
     * @param args the args
     */
    public static void main(String[] args) {
        SpringApplication.run(DMCProducerApplication.class, args);
    }
}
