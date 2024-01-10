package com.poc.feing.controller.impl;

import com.poc.feing.controller.AddressController;
import com.poc.feing.controller.dto.response.AddressResponseDTO;
import com.poc.feing.exception.NotFoundException;
import com.poc.feing.service.AddressService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/viacep")
public class AddressControllerImpl implements AddressController {

    @Autowired
    private AddressService addressService;

    @Override
    public ResponseEntity<AddressResponseDTO> getAddressByCep(@PathParam("cep") String cep) {
        try {
            AddressResponseDTO addressResponseDTO = addressService.getAddressByCep(cep).toAddressResponseDTO();
            return ResponseEntity.ok(addressResponseDTO);
        } catch (NotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).eTag(ex.getMessage()).build();
        }
    }
}
