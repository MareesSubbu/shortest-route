package com.shortest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.shortest.repo")
public class ShortestpathApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(ShortestpathApplication.class, args);
	}
}
