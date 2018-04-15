package wordservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"wordservice"})
@EnableDiscoveryClient
public class WordServiceBoot {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(WordServiceBoot.class, args);

    }

}


