package com.imooc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.imooc.interceptor.OneInterceptor;
import com.imooc.interceptor.TwoInterceptor;

/**
 * 拦截器配置类
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {
	/**
	 * 注册拦截器
	 * @param registry
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		/**
		 * 拦截器按照顺序执行
		 */
		registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/two/**")
													 .addPathPatterns("/one/**");
		registry.addInterceptor(new OneInterceptor()).addPathPatterns("/one/**");
		
		super.addInterceptors(registry);
	}

}
