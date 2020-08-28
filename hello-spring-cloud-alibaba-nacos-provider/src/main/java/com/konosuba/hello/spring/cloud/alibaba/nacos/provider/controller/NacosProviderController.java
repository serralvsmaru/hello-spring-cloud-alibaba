package com.konosuba.hello.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class NacosProviderController {

    @Value("${server.port}")
    private String port;
    @GetMapping("/echo/{message}")
    public String test(@PathVariable(value = "message") String message){
        return "hello nacos " + message + " i am from port " + port;
    }

    @Resource
    private ConfigurableApplicationContext applicationContext;
    @GetMapping("/hi")
    public String sayHi(){
        return "Hello " + applicationContext.getEnvironment().getProperty("user.name");
    }
}
