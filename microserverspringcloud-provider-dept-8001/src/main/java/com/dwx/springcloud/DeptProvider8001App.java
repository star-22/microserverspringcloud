package com.dwx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeptProvider8001App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001App.class,args);

//      DWX分支提交
        System.out.println("springboot启动成功");
        System.out.println("springboot启动成功+DWX分支提交");//第一次合并dwx分支

    }
}
