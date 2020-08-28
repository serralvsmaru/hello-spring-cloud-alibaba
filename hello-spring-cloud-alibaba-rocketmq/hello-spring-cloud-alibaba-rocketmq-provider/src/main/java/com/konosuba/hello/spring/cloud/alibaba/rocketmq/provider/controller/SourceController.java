package com.konosuba.hello.spring.cloud.alibaba.rocketmq.provider.controller;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/source")
public class SourceController {
    /**
     * Resource(name = "output") 中 name 为 主配置文件 application.yml 中配置的
     * spring.cloud.stream.bindings.output
     */
    @Resource(name = "output")
    private MessageChannel messageChannel;

    @GetMapping("/test/{message}")
    public String test(@PathVariable String message){
        messageChannel.send(MessageBuilder.withPayload(message).build());
        return "发送成功 " + message;
    }
}
