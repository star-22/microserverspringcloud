package com.dwx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //本服务启动后自动注入eureka注册中心
public class DeptProvider8003App {
    public static void main(String[] args) {

        SpringApplication.run(DeptProvider8003App.class,args);

        System.out.println("com.dwx.springcloud.DeptProvider8003App 启动成功......");
    }
}
