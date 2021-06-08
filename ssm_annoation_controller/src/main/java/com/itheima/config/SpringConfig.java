package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
//@ComponentScan(value = "com.itheima",excludeFilters =
//    @ComponentScan.Filter(type= FilterType.ANNOTATION,classes = {Controller.class}))
@ComponentScan(value = "com.itheima")
//@EnableTransactionManagement
public class SpringConfig {

}






