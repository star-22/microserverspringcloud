package com.dwx.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long deptId;

    private String deptName;

    private String dbSource;



}