package com.dwx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeptConsumer80App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80App.class,args);
        System.out.println("com.dwx.springcloud.DeptConsumer80App 启动成功......");
    }
}
