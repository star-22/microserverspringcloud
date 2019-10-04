package com.dwx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //本服务启动后自动注入eureka注册中心
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class DeptProviderHystrix8004App {
    public static void main(String[] args) {

        SpringApplication.run(DeptProviderHystrix8004App.class,args);

        System.out.println("com.dwx.springcloud.DeptProviderHystrix8004App 启动成功......");
    }
}
