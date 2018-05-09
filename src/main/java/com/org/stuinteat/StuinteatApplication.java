package com.org.stuinteat;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan("com.org.*")
//扫描 所有需要的包, 包含一些自用的工具类包 所在的路径
@ComponentScan(basePackages= {"com.org", "org.n3r.idworker"})
public class StuinteatApplication {

    public static void main(String[] args) {
        SpringApplication.run(StuinteatApplication.class, args);
    }
}
