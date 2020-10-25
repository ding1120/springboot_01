package com.atguigu.springboot.config;

import com.atguigu.springboot.bean.DataSourceProperties;
import com.atguigu.springboot.bean.DataSourceProperties01;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

public class JdbcConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.jdbc.datasource")
    public DataSourceProperties01 dataSourceProperties01(){
        return new DataSourceProperties01();
    }
}
