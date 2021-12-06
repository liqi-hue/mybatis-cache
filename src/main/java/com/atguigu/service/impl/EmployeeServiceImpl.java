package com.atguigu.service.impl;

import com.atguigu.bean.Employee;
import com.atguigu.mapper.EmployeeMapper;
import com.atguigu.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: liqi
 * @create 2021-12-06 11:06 AM
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public Employee selectByPrimaryKey(Integer id) {
        return employeeMapper.selectByPrimaryKey(id);
    }
}
