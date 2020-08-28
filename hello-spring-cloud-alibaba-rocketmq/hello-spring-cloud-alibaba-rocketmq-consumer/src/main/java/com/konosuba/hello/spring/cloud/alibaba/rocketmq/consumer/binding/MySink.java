package com.konosuba.hello.spring.cloud.alibaba.rocketmq.consumer.binding;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * 说明：不需要注册到容器中，在启动类中 @EnableBinding 使其生效
 *
 * @author sheng
 */
public interface MySink {
    /**
     * 自定义 binding
     *
     * @return org.springframework.messaging.SubscribableChannel 对象
     */
    @Input("myInput1")
    SubscribableChannel myInput1();

    /**
     * 自定义 binding
     *
     * @return org.springframework.messaging.SubscribableChannel 对象
     */
    @Input("myInput2")
    SubscribableChannel myInput2();
}
