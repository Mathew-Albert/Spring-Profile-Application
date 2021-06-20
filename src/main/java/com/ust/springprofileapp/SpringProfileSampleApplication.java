package com.ust.springprofileapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProfileSampleApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringProfileSampleApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringProfileSampleApplication.class, args);
		LOGGER.info("Springboot profiles application is running successfully.");
	}


}
