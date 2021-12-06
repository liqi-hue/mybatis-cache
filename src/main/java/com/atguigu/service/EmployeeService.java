package com.atguigu.service;

import com.atguigu.bean.Employee;

/**
 * @author: liqi
 * @create 2021-12-06 11:06 AM
 */

public interface EmployeeService {
    Employee selectByPrimaryKey(Integer id);
}
