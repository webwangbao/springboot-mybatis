package com.imooc.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 读取配置文件
 * @Configuration：声明为一个配置类
 * @ConfigurationProperties(prefix="com.imooc.opensource")：声明配置文件的前缀
 * @PropertySource(value="classpath:resource.properties")：加载配置文件的位置
 */
@Configuration
@ConfigurationProperties(prefix="com.imooc.opensource")
@PropertySource(value="classpath:resource.properties")
public class Resource {
	private String name;
	private String website;
	private String language;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
}
