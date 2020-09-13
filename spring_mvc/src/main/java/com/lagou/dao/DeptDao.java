package com.lagou.dao;

import com.lagou.domain.Dept;

import java.util.List;

public interface DeptDao {

    /*
        查询所有
     */
    public List<Dept> findAll();

}
