package com.analab.execu.util;

import org.springframework.context.annotation.Configuration;


import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		/**
		 * 访问的任何东西都允许跨域，跨域来源http://xxx.xxx.xxx.xxx:8080 vue的端口
		 * 跨域方法，允许携带信息，设置最大响应时间3600.
		 */
		registry.addMapping("/**")
		.allowedOrigins("*", "null")    // http://192.168.0.154:8080
		.allowedMethods("GET","POST","PUT","OPTIONS","DELETE")
		.allowedHeaders("*")
		.maxAge(3600)
		.allowCredentials(true);
	}
}
