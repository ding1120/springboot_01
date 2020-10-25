package com.atguigu.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


 //@ComponentScan("com.atguigu.springboot") 默认扫描项目下的包
@SpringBootApplication //启动工程需加入注解
public class Application {
    public static void main(String[] args) {
        //调用run方法
    SpringApplication.run(Application.class,args);


    }
}
