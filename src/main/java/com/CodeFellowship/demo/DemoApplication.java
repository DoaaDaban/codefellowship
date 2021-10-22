package com.CodeFellowship.demo;

import com.CodeFellowship.demo.infrastructure.RoleRepository;
import com.CodeFellowship.demo.model.Role;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.slf4j.Logger;

@SpringBootApplication
public class DemoApplication {
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(RoleRepository roleRepository) {
		return args -> {
			log.info("Preloading " + roleRepository.save(new Role("USER")));
			log.info("Preloading " + roleRepository.save(new Role("ADMIN")));
		};
	}

}
