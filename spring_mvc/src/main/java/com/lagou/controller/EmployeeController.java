package com.lagou.controller;

import com.lagou.domain.Employee;
import com.lagou.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/employee") //一级访问目录
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;
    /*
        查询所有用户
     */

    @RequestMapping("/findAll")
    public  String findAll(Model model){

        //实现查询所有账户
        List<Employee> list = employeeService.findAll();

        // 把封装好的list存到model中
        model.addAttribute("list",list);

        return "list";


    }

    @RequestMapping("/save")
//    public String save(Employee employee){
//        System.out.println(employee);
////        employeeService.save(employee);
//        // 跳转到findAll方法从新查询一次数据库进行数据的遍历展示
//        return "redirect:/employee/findAll";
//    }
    public String save(Employee employee){

        employeeService.save(employee);
        // 跳转到findAll方法从新查询一次数据库进行数据的遍历展示
        return "redirect:/employee/findAll";
    }
}
