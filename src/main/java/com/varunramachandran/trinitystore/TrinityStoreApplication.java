package com.varunramachandran.trinitystore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.varunramachandran.trinitystore.model"} )
@EnableJpaRepositories(basePackages = {"com.varunramachandran.trinitystore.repository"})
public class TrinityStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrinityStoreApplication.class, args);
	}

}
