package com.example.billingservice;

import com.example.billingservice.dto.InvoiceRequestDTO;
import com.example.billingservice.service.InvoiceService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@EnableFeignClients
@SpringBootApplication
public class BillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner runner(InvoiceService invoiceService){
		return args -> {
			invoiceService.save(new InvoiceRequestDTO(BigDecimal.valueOf(2345), 1L));
			invoiceService.save(new InvoiceRequestDTO(BigDecimal.valueOf(6666), 1L));
			invoiceService.save(new InvoiceRequestDTO(BigDecimal.valueOf(3333), 1L));
			invoiceService.save(new InvoiceRequestDTO(BigDecimal.valueOf(22432), 2L));
		};
	}
}
