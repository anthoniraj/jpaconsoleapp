package com.example.console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsoleApplication implements CommandLineRunner
{
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(final String[] args) {
		SpringApplication.run(ConsoleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/* Select * from employee */
		System.out.println(employeeRepository.findAll());
		
	}

}
