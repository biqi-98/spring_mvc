package com.lagou.test;

import com.lagou.dao.DeptDao;
import com.lagou.domain.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DeptTest {

    @Test
    public void  testMybatis() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        DeptDao mapper = sqlSession.getMapper(DeptDao.class);

        List<Dept> all = mapper.findAll();

        for (Dept Dept : all) {
            System.out.println(Dept);
        }

        sqlSession.close();


    }




}
