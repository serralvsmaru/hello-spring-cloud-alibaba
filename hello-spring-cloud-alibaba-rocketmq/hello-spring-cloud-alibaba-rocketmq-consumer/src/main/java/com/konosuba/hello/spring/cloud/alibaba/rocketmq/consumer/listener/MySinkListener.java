package com.konosuba.hello.spring.cloud.alibaba.rocketmq.consumer.listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class MySinkListener {
    @StreamListener("myInput1")
    public void myOutput1(String message){
        System.out.println("myInput1: " + message);
    }

    @StreamListener("myInput2")
    public void myOutput2(String message){
        System.out.println("myInput2: " + message);
    }
}
