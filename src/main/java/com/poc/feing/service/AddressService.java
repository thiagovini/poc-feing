package com.poc.feing.service;

import com.poc.feing.entity.Address;

public interface AddressService {

    Address getAddressByCep(String cep);
}
