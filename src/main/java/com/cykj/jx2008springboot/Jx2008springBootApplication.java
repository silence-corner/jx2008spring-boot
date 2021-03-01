package com.cykj.jx2008springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// 标注说明这个类是SpringBoot的主配置类
// 全局配置文件application.properties/application.yml名称是固定
@SpringBootApplication

// 配置dao层接口路径
@MapperScan("com.cykj.jx2008springboot.mapper")
// ComponentScan用于类或接口上主要是指定的扫描路径
// spring会把指定路径下带有指定注解的类进行自动装配
// 效果类似于 <context:component-scan base-package="com.cykj.jx2008springboot.controller">
@ComponentScan({"com.cykj.jx2008springboot.controller","com.cykj.jx2008springboot.service"})
public class Jx2008springBootApplication {

    // 项目启动，就用主配置类的main方法来运行
    public static void main(String[] args) {
        SpringApplication.run(Jx2008springBootApplication.class, args);
    }

}
