package com.dwx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.dwx.springcloud")
public class DeptConsumerFeign81App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign81App.class,args);
        System.out.println("com.dwx.springcloud.DeptConsumerFeign81App 启动成功......");
    }
}
