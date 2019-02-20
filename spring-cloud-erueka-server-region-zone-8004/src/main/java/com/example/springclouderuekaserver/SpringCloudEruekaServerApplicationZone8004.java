package com.example.springclouderuekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEruekaServerApplicationZone8004 {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEruekaServerApplicationZone8004.class, args);
    }

}
