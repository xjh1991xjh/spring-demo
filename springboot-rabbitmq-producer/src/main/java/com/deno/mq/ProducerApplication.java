package com.deno.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProducerApplication.class, args);
    }
}
