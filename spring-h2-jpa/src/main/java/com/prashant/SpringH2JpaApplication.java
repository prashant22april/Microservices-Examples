package com.prashant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringH2JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringH2JpaApplication.class, args);
	}
}
