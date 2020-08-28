package com.konosuba.hello.spring.cloud.alibaba.rocketmq.consumer.listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class SinkListener {
    @StreamListener("input")
    public void input(String message){
        System.out.println("input: " + message);
    }
}
