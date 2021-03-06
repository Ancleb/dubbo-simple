package com.yyl.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.Scanner;

@SpringBootApplication
@ImportResource("classpath:spring-dubbo.xml")
public class Provider {

    public static void main(String[] args) {
        SpringApplication.run(Provider.class, args);
        // new Scanner(System.in).next();
    }

}
