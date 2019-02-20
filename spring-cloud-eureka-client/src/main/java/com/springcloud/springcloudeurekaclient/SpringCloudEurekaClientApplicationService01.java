package com.springcloud.springcloudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaClientApplicationService01 {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClientApplicationService01.class, args);
    }

}
