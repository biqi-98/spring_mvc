package com.lagou.service.impl;

import com.lagou.domain.Dept;
import com.lagou.service.DeptService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DeptServiceImpl implements DeptService {

    /**
     * spring 的单独使用
     * @return
     */
    public List<Dept> findAll() {
        return null;
    }
}
