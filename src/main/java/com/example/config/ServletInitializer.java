package com.example.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author: zurichscud
 * @Date: 2023/9/24 18:19
 * @Description: TODO
 */
public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * @Description: Spring基础配置
     * @Param: 
     * @Return: 
     **/
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
