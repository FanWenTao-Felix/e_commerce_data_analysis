package com.youfan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BillonDataRegiterStarter {
    public static void main(String[] args) {
        SpringApplication.run(BillonDataRegiterStarter.class,args);
    }
}
