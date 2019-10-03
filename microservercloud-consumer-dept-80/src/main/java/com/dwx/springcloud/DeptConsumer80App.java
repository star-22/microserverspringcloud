package com.dwx.springcloud;

import com.dwx.myrule.config.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVERCLOUD-DEPT", configuration = MySelfRule.class) //  MySelfRule 类必须放在主启动类所在包外
public class DeptConsumer80App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80App.class,args);
        System.out.println("com.dwx.springcloud.DeptConsumer80App 启动成功......");
    }
}
