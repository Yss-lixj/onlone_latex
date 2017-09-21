package com.diego.spring.boot.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author Manfred
 *
 */
@EnableAutoConfiguration
@SpringBootApplication
public class MainApplication  extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
    }

}

