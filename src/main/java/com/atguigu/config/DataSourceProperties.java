package com.atguigu.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: liqi
 * @create 2021-12-06 10:56 AM
 */
@ConfigurationProperties(prefix = "datasource")
public class DataSourceProperties {

    private String driver;
    private String username;
    private String password;
    private String url;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
