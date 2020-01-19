package com.beast.tamer.learn.course01.intercepte;

import com.beast.tamer.learn.course01.annotation.FieldName;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Field;

/**
 * @author a small asshole
 * @version 1.0
 * @description 注解拦截器
 * @date in 16:25 2020/1/19
 * @since 1.0
 */
public class AnnotationInterceptor implements HandlerInterceptor {
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("AfterReturning");
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Class<?> returnTypeClass = handlerMethod.getMethod().getReturnType();
        //获取类中的属性
        Field[] declaredFields = returnTypeClass.getDeclaredFields();
        for (Field field : declaredFields) {
            //获取属性上的FieldName注解
            FieldName annotation = field.getAnnotation(FieldName.class);
            if(annotation != null){
                String value = annotation.value();
                System.out.println(value);
            }
        }
    }
}
