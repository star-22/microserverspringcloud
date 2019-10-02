package com.dwx.springcloud.web.controller;

import com.dwx.springcloud.entities.Dept;
import com.dwx.springcloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.get(id);
        return dept;

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
