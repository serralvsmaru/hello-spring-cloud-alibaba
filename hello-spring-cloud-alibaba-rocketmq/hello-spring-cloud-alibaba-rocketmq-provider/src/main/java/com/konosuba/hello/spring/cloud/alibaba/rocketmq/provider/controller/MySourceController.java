package com.konosuba.hello.spring.cloud.alibaba.rocketmq.provider.controller;

import com.konosuba.hello.spring.cloud.alibaba.rocketmq.provider.bindings.MySource;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/mySource")
public class MySourceController {

    @Resource
    private MySource mySource;

    @GetMapping("/test/{message}")
    public String myOutput1(@PathVariable String message){
        mySource.myOutput1().send(MessageBuilder.withPayload(message).build());
        return "myOutput1 " + message;
    }

    @GetMapping("/shadow/{message}")
    public String myOutput2(@PathVariable String message){
        mySource.myOutput1().send(MessageBuilder.withPayload(message).build());
        return "myOutput2 " + message;
    }
}
