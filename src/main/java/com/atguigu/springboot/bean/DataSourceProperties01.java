package com.atguigu.springboot.bean;

import org.springframework.stereotype.Component;


public class DataSourceProperties01 {
    private String driverClassName;
    private String url;
    private String password;
    private String username;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "DataSourceProperties01{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
