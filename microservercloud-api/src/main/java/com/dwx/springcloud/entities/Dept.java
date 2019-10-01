package com.dwx.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor
@Data
@Accessors(chain = true)    //开启链式写法，默认为false
public class Dept implements Serializable {

    //必须序列化
    private static final long serialVersionUID = 1L;

    private Long deptId;    //部门Id

    private String deptName;    //部门名称

    private String dbSource;    //连接数据库名称



}