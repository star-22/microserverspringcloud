package com.dwx.springcloud.service;

import com.dwx.springcloud.entities.Dept;

import java.util.List;

public interface IDeptService {


    Dept get(Long id);

    boolean add(Dept dept);

    List<Dept> getList();

    boolean deleteById(Long id);

    boolean update(Dept dept);
}
