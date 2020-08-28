package com.konosuba.hello.spring.cloud.alibaba.nacos.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class NacosConsumerConfiguration {
    @Bean
    // RestTemplate在请求时拥有客户端负载均衡的能力
//    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
