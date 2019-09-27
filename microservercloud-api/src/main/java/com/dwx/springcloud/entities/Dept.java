package com.dwx.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Dept {

    private Integer DeptId;

    private String DeptName;

    private String dbSource;
}
