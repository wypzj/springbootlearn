package com.beast.tamer.learn.course01.config;

import com.beast.tamer.learn.course01.intercepte.AnnotationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author a small asshole
 * @version 1.0
 * @description 定义回调方法来自定义基于java的Spring MVC配置
 * @date in 16:36 2020/1/19
 * @since 1.0
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    /**
     * 添加拦截器到链路
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("添加拦截器链路");
        registry.addInterceptor(new AnnotationInterceptor());
    }
}
