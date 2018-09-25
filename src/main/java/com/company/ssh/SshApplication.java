package com.company.ssh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SshApplication {

	public static void main(String[] args) {
		SpringApplication.run(SshApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure( SpringApplicationBuilder builder) {
		SpringApplicationBuilder sources = builder.sources(this.getClass());
		System.out.println(1234);
		return sources;
	}
}
