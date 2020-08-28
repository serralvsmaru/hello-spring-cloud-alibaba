package com.konosuba.hello.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.konosuba.hello.spring.cloud.alibaba.nacos.consumer.feign.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class NacosConsumerFeignController {
    @Resource
    private FeignService feignService;

    @GetMapping(value = "/echo/hi")
    public String echo(){
        return feignService.echo("Hi Feign");
    }
}
