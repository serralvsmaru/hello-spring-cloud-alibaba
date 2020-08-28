package com.konosuba.hello.spring.cloud.alibaba.rocketmq.provider.bindings;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


public interface MySource {
    /**
     * 说明：自定义 binding，不需要注册到容器中，在启动类中配合 @EnableBinding 使其生效
     *
     * @author sheng
     */
    @Output("myOutput1")
    MessageChannel myOutput1();

    @Output("myOutput2")
    MessageChannel myOutput2();
}
