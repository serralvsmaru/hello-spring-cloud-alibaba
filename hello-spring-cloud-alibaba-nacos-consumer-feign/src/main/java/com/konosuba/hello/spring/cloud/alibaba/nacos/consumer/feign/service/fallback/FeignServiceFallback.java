package com.konosuba.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback;

import com.konosuba.hello.spring.cloud.alibaba.nacos.consumer.feign.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceFallback implements FeignService {
    public String echo(String message) {
        return "echo fallback";
    }
}
