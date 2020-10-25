package com.atguigu.springboot.controller;



import com.atguigu.springboot.bean.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import javax.annotation.Resource;
import javax.sql.DataSource;


@RestController //组合 ==>@ResquesetBody 和 @controller 注解的组合
//应用注解启用DataSourceProperties2
@EnableConfigurationProperties(JdbcProperties.class)
public class HelloController {

    //(1).给每个属性添加注解(value)
//    @Autowired
//    private DataSourceProperties dataSourceProperties;


    @Autowired
    JdbcProperties jdbcProperties;





    @RequestMapping("/hello")
    public String Hello(){
        //获取数据源的名字
        System.out.println("jdbcProperties="+jdbcProperties);
        return "hello,springboot...";
    }
}


