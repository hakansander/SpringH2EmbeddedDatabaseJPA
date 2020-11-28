package com.hakansander.embedded.h2embeddeddatabase;

import com.hakansander.embedded.h2embeddeddatabase.entity.Person;
import com.hakansander.embedded.h2embeddeddatabase.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import java.util.Date;

//@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository personJpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 10001 -> {}", personJpaRepository.findById(10001));
		logger.info("Inserting -> {}", personJpaRepository.insert(new Person("Tara", "Berlin", new Date())));
		logger.info("Inserting 10004 -> {}", personJpaRepository.update(new Person(10003, "Pieter", "Utrecht", new Date())));

		personJpaRepository.deleteById(10002);

		logger.info("All people -> {}", personJpaRepository.findAll());
	}

}
