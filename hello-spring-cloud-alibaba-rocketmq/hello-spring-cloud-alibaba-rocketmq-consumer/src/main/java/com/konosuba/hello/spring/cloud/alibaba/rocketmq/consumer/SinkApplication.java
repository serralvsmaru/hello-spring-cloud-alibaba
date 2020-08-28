package com.konosuba.hello.spring.cloud.alibaba.rocketmq.consumer;

import com.konosuba.hello.spring.cloud.alibaba.rocketmq.consumer.binding.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding({Sink.class, MySink.class})
public class SinkApplication {
    public static void main(String[] args) {
        SpringApplication.run(SinkApplication.class, args);
    }
}
