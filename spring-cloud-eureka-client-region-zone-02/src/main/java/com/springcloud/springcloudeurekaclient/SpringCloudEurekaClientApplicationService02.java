package com.springcloud.springcloudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaClientApplicationService02 {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClientApplicationService02.class, args);
    }

}
