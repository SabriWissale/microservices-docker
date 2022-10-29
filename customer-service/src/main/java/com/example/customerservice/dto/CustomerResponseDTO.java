package com.example.customerservice.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerResponseDTO {
    private Long id;
    private String name;
    private String email;
}
