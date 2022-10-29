package com.example.billingservice.rest;

import com.example.billingservice.entity.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerRestClient {
    @GetMapping("/api/customers/{id}")
    Customer getCustomer(@PathVariable(name = "id") Long id);

    @GetMapping
    Customer  getAllCustomers();
}
