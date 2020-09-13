package com.lagou.service.impl;

import com.lagou.dao.EmployeeDao;
import com.lagou.domain.Employee;
import com.lagou.service.DeptService;
import com.lagou.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    //需要用到EmployeeDao的代理对象
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> findAll() {
        List<Employee> all = employeeDao.findAll();
        return all;
    }

    /*
        账户添加
     */
    @Override
    public void save(Employee employee) {

        employeeDao.save(employee);

    }
}
