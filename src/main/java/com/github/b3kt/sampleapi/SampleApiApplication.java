package com.github.b3kt.sampleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EnableAutoConfiguration
@SpringBootApplication
public class SampleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApiApplication.class, args);
	}

}
