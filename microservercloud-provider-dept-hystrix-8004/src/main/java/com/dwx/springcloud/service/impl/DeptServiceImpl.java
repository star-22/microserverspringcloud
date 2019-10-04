package com.dwx.springcloud.service.impl;

import com.dwx.springcloud.entities.Dept;
import com.dwx.springcloud.mapper.DeptMapper;
import com.dwx.springcloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept get(Long id) {
        Dept dept = deptMapper.selectByPrimaryKey(id);
        return dept;
    }

    @Override
    public boolean add(Dept dept) {
        return deptMapper.insert(dept);
    }

    @Override
    public List<Dept> getList() {
        return deptMapper.selectAll();
    }

    @Override
    public boolean deleteById(Long id) {
        return deptMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean update(Dept dept) {
        return deptMapper.updateByPrimaryKeySelective(dept);
    }
}
