package com.dwx.springcloud.service;

import com.dwx.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //必须添加该注解
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {


    @Override
    public DeptClientService create(Throwable cause) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptId(id)
                        .setDeptName("该ID："+ id +"没有对应的信息,Consumer客户端提供的降级信息，此刻服务Provider已经关闭")
                        .setDbSource("no this database in MySQL");
            }

            @Override
            public List<Dept> getList() {
                return null;
            }

            @Override
            public void delete(Long id) {

            }
        };
    }
}
