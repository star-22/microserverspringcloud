package com.dwx.springcloud.web.controller;

import com.dwx.springcloud.entities.Dept;
import com.dwx.springcloud.service.IDeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private IDeptService deptService;

    /**
     * 根据部门Id获取某一个部门信息
     * @param id    部门Id
     * @return 返回该Id部门的信息
     */
    @ResponseBody
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_GET")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.get(id);
        if (dept == null){
            throw new RuntimeException("该ID："+ id +"没有对应的信息");
        }
        return dept;

    }

    public Dept processHystrix_GET(@PathVariable("id") Long id){

        return new Dept().setDeptId(id)
                .setDeptName("该ID："+ id +"没有对应的信息,null--@HystrixCommand")
                .setDbSource("no this database in MySQL");

    }



    /**
     * 添加一个部门信息
     * @param dept  需要添加的部门的对象
     * @return  返回添加是否成功 TRUE / FALSE
     */
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean add(Dept dept){
        boolean b = deptService.add(dept);
        return b;
    }

    @ResponseBody
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<Dept> list(){
        List<Dept> depts = deptService.getList();
        return depts;
    }

    @ResponseBody
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable("id")Long id){
        return deptService.deleteById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public boolean update(Dept dept){
        return deptService.update(dept);
    }
}
