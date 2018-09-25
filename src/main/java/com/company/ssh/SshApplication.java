package com.company.ssh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SshApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(SshApplication.class, args);
		
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		SpringApplicationBuilder sources = builder.sources(this.getClass());
		System.out.println(1234);

		return sources;
	}
}
