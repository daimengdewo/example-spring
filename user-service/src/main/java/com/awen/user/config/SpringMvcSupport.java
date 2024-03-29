package com.awen.user.config;

import com.awen.feign.interceptor.ProjectInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Slf4j
@Configuration
@ComponentScan(basePackages = {"com.awen.feign"})
public class SpringMvcSupport extends WebMvcConfigurationSupport {

    @Autowired
    private ProjectInterceptor projectInterceptor;

    /**
     * 注册拦截器
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor).addPathPatterns("/**");
    }

}
