package com.petplanet.wechat.mp.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 相当于web.xml配置
 */
@Slf4j
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected String[] getServletMappings() {
        log.info("------映射根路径初始化------");
        return new String[]{"/"};//请求路径映射，根路径
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        log.info("------root配置类初始化------");
        return new Class<?>[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        log.info("------web配置类初始化------");
        return new Class<?>[]{SpringMvcConfig.class};
    }
}
