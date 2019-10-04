package com.dwx.springcloud.mapper;

import com.dwx.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    boolean deleteByPrimaryKey(Long deptId);

    boolean insert(Dept dept);

    int insertSelective(Dept dept);

    Dept selectByPrimaryKey(Long deptId);

    boolean updateByPrimaryKeySelective(Dept dept);

    boolean updateByPrimaryKey(Dept dept);

    List<Dept> selectAll();
}