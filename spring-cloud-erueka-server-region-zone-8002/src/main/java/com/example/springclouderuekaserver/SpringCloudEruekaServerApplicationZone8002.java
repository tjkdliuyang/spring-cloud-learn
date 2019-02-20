package com.example.springclouderuekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEruekaServerApplicationZone8002 {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEruekaServerApplicationZone8002.class, args);
    }

}
