package com.tonmx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class SpringCloudTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudTurbineApplication.class, args);
    }


}