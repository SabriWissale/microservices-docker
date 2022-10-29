package com.example.billingservice.service;

import com.example.billingservice.dto.InvoiceRequestDTO;
import com.example.billingservice.dto.InvoiceResponseDTO;


import java.util.List;

public interface InvoiceService {
    InvoiceResponseDTO save(InvoiceRequestDTO invoiceRequestDTO);
    InvoiceResponseDTO getInvoice(Long id);
    List<InvoiceResponseDTO> getAllInvoices();
    List<InvoiceResponseDTO> invoicesBycustomerId(Long id);
}
