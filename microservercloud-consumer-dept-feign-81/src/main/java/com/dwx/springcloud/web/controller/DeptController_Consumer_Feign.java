package com.dwx.springcloud.web.controller;

import com.dwx.springcloud.entities.Dept;
import com.dwx.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("/dept_consumer")
public class DeptController_Consumer_Feign {

    @Autowired
    private DeptClientService deptClientService;

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean add(Dept dept){
        return deptClientService.add(dept);
    }

    @ResponseBody
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return deptClientService.get(id);
    }

    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Dept> getList(){
        return deptClientService.getList();
    }

    @ResponseBody
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id){
        deptClientService.delete(id);
    }
}
