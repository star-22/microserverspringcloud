package com.dwx.springcloud.web.controller;

import com.dwx.springcloud.entities.Dept;
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
public class DeptController_Consumer {

    private static final String REST_URL_PREFIX = "http://localhost:8001/dept";

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/add",dept,Boolean.class);
    }

    @ResponseBody
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/get/"+id,Dept.class);
    }

    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Dept> getList(){
        List<Dept> list = restTemplate.getForObject(REST_URL_PREFIX + "/list", List.class);
        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id){
        restTemplate.delete(REST_URL_PREFIX+"/delete/" + id );
    }
}
