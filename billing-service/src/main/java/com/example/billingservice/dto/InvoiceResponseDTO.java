package com.example.billingservice.dto;


import com.example.billingservice.entity.Customer;
import lombok.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceResponseDTO {
    private Long id;
    private Date data;
    private BigDecimal amount;
    private Customer customer;
}
