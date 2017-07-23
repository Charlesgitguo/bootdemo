package com.gqq.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by guo on 2017/6/28.
 */
@Configuration

@MapperScan(
        {"com.gqq.test.dao",
       "com.gqq.test.*.dao"})
public class TestDataSource {


    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.test")
    public DataSource getDataSource(){
        return  new ComboPooledDataSource();
    }

}
