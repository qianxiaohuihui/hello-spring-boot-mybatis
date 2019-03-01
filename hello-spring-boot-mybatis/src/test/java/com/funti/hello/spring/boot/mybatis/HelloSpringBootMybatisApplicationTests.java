package com.funti.hello.spring.boot.mybatis;

import com.funti.hello.spring.boot.mybatis.dao.AppuserMapper;
import com.funti.hello.spring.boot.mybatis.entity.Appuser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//SpringBootTest是为了能加载到yml配置文件内容
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloSpringBootMybatisApplication.class)
@Transactional
@Rollback
public class HelloSpringBootMybatisApplicationTests {

    @Autowired
    private AppuserMapper appuserMapper;

    @Test
    public void testSelect(){
        List<Appuser> appusers = appuserMapper.selectAll();
        for (Appuser appuser:appusers){
            System.out.println(appuser.getLoginName());
        }
    }

    /*@Test
    public void testPage(){
        PageHelper.startPage(1,3);
        Example example = new Example(Appuser.class);       //有问题，不会调
        PageInfo<Appuser> pageInfo =new PageInfo<Appuser>(appuserMapper.selectAll());
        List<Appuser> list = pageInfo.getList();
        for(Appuser appuser: list){
            System.out.println(appuser.getLoginName());
        }
    }*/
}
