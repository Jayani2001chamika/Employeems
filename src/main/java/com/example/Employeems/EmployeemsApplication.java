package com.example.Employeems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemsApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper{
		
	}

}
