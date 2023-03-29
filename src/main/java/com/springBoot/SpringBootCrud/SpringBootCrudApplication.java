package com.springBoot.SpringBootCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "Controller")
@EnableJpaRepositories(basePackages = "ImplementRepository")
@EntityScan(basePackages = "EntityClass")
public class SpringBootCrudApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}

}
