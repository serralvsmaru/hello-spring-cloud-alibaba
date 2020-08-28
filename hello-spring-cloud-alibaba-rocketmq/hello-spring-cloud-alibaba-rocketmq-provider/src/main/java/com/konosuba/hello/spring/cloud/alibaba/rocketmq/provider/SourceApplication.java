package com.konosuba.hello.spring.cloud.alibaba.rocketmq.provider;

import com.konosuba.hello.spring.cloud.alibaba.rocketmq.provider.bindings.MySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
@EnableBinding({Source.class, MySource.class})
public class SourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SourceApplication.class, args);
    }
}
