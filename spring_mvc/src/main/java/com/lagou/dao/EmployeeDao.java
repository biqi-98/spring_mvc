package com.lagou.dao;

import com.lagou.domain.Dept;
import com.lagou.domain.Employee;

import java.util.List;

public interface EmployeeDao {

    /*
        查询所有
     */
    public List<Employee> findAll();

    /*
        新增
     */
    void save(Employee employee);
}
