package com.poc.feing.client;

import com.poc.feing.client.dto.response.AddressResponseClientDTO;
import com.poc.feing.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep", configuration = FeignConfig.class)
public interface ViacepClient {

    @GetMapping("{cep}/json")
    AddressResponseClientDTO getAddressByCep(@PathVariable String cep);

}
