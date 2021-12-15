package com.yyl.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring-dubbo.xml")
public class Consumer07 {

    public static void main(String[] args) {
        SpringApplication.run(Consumer07.class, args);
    }

}
