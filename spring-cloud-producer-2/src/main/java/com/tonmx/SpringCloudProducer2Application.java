package com.tonmx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudProducer2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProducer2Application.class, args);
    }


}