package com.lagou.service;

import com.lagou.domain.Dept;
import com.lagou.domain.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();

    void save(Employee employee);
    //搭建springMVC环境，要求和spring的ioc容器中bean对象分开扫描加载。
    //5、编写web.xml中的配置文件，要求servlet随着应用加载创建，解决post请求乱码。
    //6、编写表现层，业务层和持久层代码时，要求分包建立，且命名规范。
    //7、实现员工的新增操作时,ajax查询部门信息。
    //8、实现员工的查询和新增操作时，要求解决日期格式转换。
}
