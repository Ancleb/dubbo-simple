package com.yyl.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring-dubbo.xml")
public class Provider06 {

    public static void main(String[] args) {
        SpringApplication.run(Provider06.class, args);
        // new Scanner(System.in).next();
    }

}
