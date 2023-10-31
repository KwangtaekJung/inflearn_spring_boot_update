package com.example.springbootupdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SpringBootUpdateApplication {

	@Value("${service.message}")
	private String message;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUpdateApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner() {
		return args -> System.out.println(message);
	}

}
