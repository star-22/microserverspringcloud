package com.dwx.springcloud.service;

import com.dwx.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient(value = "MICROSERVERCLOUD-DEPT")
public interface DeptClientService {

    @ResponseBody
    @RequestMapping(value = "dept/add", method = RequestMethod.POST)
    boolean add(Dept dept);

    @ResponseBody
    @RequestMapping(value = "dept/get/{id}", method = RequestMethod.GET)
    Dept get(@PathVariable("id") Long id);

    @ResponseBody
    @RequestMapping(value = "dept/list", method = RequestMethod.GET)
    List<Dept> getList();

    @ResponseBody
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") Long id);

}
