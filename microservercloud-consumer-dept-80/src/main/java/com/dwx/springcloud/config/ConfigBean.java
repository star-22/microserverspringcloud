package com.dwx.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced   //Spring Cloud Ribbon是基于Netflix实现的一套客户端负载均衡工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule(){
////          return new RoundRobinRule();                // 轮询算法
//        return new RandomRule();                      // 随机算法
////        return new AvailabilityFilteringRule();        //
//    }
}
