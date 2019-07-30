package com.petplanet.wechat.mp.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 相当于applicationContext.xml配置
 */
@Slf4j
@Configuration
@ComponentScan(basePackages = {"com.petplanet.wechat.mp.config", "com.petplanet.wechat.mp.dao", "com.petplanet.wechat.mp.service"})
@Import(value = DataSourceConfig.class)
public class SpringConfig {
    @Bean
    public BeanNameAutoProxyCreator proxycreate() {
        BeanNameAutoProxyCreator proxycreate = new BeanNameAutoProxyCreator();
        proxycreate.setProxyTargetClass(true);
        proxycreate.setBeanNames("*ServiceImpl");
        proxycreate.setInterceptorNames("transactionInterceptor");
        return proxycreate;
    }
}