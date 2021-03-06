package com.sinus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class SpringWebSecurityApplication extends SpringBootServletInitializer {

	private static Class<SpringWebSecurityApplication> applciationClass = SpringWebSecurityApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(SpringWebSecurityApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(applciationClass);
	}
}
