package com.springcloud.springcloudeurekaclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DepartCodeConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
