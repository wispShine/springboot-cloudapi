package com.goldenhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.spring.web.SpringfoxWebMvcConfiguration;

@SpringBootApplication
@ConditionalOnClass(SpringfoxWebMvcConfiguration.class)
public class GoldenhomeCloudapiApplication extends SpringBootServletInitializer implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(GoldenhomeCloudapiApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GoldenhomeCloudapiApplication.class);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//静态资源 swagger-bootstrap-ui
		registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
}
