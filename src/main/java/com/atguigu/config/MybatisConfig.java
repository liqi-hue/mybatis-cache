package com.atguigu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author: liqi
 * @create 2021-12-06 10:54 AM
 */
@Configuration
@EnableConfigurationProperties(DataSourceProperties.class)
@MapperScan("com.atguigu.mapper")
public class MybatisConfig {


    @Bean
    public DataSource dataSource( DataSourceProperties dataSourceProperties){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(dataSourceProperties.getUsername());
        druidDataSource.setPassword(dataSourceProperties.getPassword());
        druidDataSource.setUrl(dataSourceProperties.getUrl());
        druidDataSource.setDriverClassName(dataSourceProperties.getDriver());
        return druidDataSource;
    }
}
