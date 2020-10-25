package com.atguigu.springboot.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.jdbc")
public class JdbcProperties {

    private DataSourceProperties01 dataSource;
    private String type;

    public DataSourceProperties01 getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSourceProperties01 dataSource) {
        this.dataSource = dataSource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "JdbcProperties{" +
                "dataSource=" + dataSource +
                ", type='" + type + '\'' +
                '}';
    }
}
