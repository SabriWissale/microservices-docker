package com.example.customerservice.service;

import com.example.customerservice.dto.CustomerRequestDTO;
import com.example.customerservice.dto.CustomerResponseDTO;

import java.util.List;

public interface CustomerService {
    CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO getCustomer(long id);
    CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO);
    void delete(long id);
    List<CustomerResponseDTO> getListCustomer();
}
