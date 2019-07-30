package com.petplanet.wechat.mp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 相当于spring-mvc.xml配置
 */
@ComponentScan(basePackages = {"com.petplanet.wechat.mp.controller"})
@EnableWebMvc   //开启spring mvc 功能
@Configuration
public class SpringMvcConfig extends WebMvcConfigurerAdapter {
}