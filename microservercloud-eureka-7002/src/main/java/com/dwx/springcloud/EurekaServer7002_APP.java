package com.dwx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_APP {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_APP.class,args);
        System.out.println("com.dwx.springcloud.EurekaServer7002_APP 启动成功......");
    }
}
