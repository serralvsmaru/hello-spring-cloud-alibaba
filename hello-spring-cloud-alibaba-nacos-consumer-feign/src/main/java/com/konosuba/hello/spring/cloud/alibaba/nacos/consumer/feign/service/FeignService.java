package com.konosuba.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import com.konosuba.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback.FeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-provider", fallback = FeignServiceFallback.class)
public interface FeignService {
    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable("message") String message);
}
