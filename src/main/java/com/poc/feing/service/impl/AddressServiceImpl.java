package com.poc.feing.service.impl;

import com.poc.feing.client.ViacepClient;
import com.poc.feing.entity.Address;
import com.poc.feing.exception.NotFoundException;
import com.poc.feing.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public record AddressServiceImpl(ViacepClient viacepClient) implements AddressService {

    @Override
    public Address getAddressByCep(String cep) {
        Address address = viacepClient.getAddressByCep(cep).toAddress();
        if (address.getCep() == null)
            throw new NotFoundException(cep);
        return address;
    }
}
