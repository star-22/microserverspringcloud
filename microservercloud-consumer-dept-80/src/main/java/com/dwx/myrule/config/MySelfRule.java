package com.dwx.myrule.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    /**
     * 自定义负载均衡策略
     * @return
     */
    @Bean
    public IRule myRule(){
//        return new RandomRule();          // 默认是轮询，自定以为随机
        return new RoundRobinRule_ZDY();    // 自定义5次一轮询

    }
}
