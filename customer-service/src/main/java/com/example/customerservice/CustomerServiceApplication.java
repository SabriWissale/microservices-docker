package com.example.customerservice;

import com.example.customerservice.dto.CustomerRequestDTO;
import com.example.customerservice.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(CustomerService customerService){
		return args -> {
			customerService.save(new CustomerRequestDTO(null, "ali", "ali@gmail.com"));
			customerService.save(new CustomerRequestDTO(null, "amine", "amine@gmail.com"));
			customerService.getListCustomer().forEach(System.out::println);
		};
	}
}
