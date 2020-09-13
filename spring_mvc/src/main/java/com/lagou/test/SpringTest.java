package com.lagou.test;

import com.lagou.domain.Employee;
import com.lagou.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest {

    @Autowired
    private EmployeeService employeeService;


    @Test
    public void testSpring(){

        List<Employee> all = employeeService.findAll();
        for (Employee employee : all) {
            System.out.println(employee);
        }

    }






}
