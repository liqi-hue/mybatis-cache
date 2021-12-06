package com.atguigu.controller;

//import com.atguigu.bean.Employee;

import com.atguigu.bean.Employee;
import com.atguigu.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liqi
 * @create 2021-12-06 11:08 AM
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id){
        employeeService.selectByPrimaryKey(id);
        return employeeService.selectByPrimaryKey(id);
    }
}
