package com.deno.mq.sender;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String sendMsg = "hello, i am simple sender " + new Date();
        System.out.println("SimpleSender send msg: " + sendMsg);
        this.rabbitTemplate.convertAndSend("hello", sendMsg);
    }
}
