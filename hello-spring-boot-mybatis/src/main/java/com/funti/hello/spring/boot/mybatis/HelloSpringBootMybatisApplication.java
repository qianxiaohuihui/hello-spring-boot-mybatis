package com.funti.hello.spring.boot.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.funti.hello.spring.boot.mybatis.dao")
public class HelloSpringBootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBootMybatisApplication.class, args);
    }

}
