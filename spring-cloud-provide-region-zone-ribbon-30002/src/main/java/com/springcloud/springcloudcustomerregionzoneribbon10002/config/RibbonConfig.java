package com.springcloud.springcloudcustomerregionzoneribbon10002.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Ribbon的配置
 */
@Configuration
public class RibbonConfig {
    /**
     * 通过LoadBalanced 来启用Ribbon
     * @return RestTemplate 实例
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
