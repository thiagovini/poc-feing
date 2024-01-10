package com.poc.feing.controller;

import com.poc.feing.controller.dto.response.AddressResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface AddressController {

    @GetMapping("/cep")
    ResponseEntity<AddressResponseDTO> getAddressByCep(String cep);

}
