package com.poc.feing.entity;

import com.poc.feing.controller.dto.response.AddressResponseDTO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {

    private String cep;
    private String street;
    private String additionalInfo;
    private String neighborhood;
    private String locality;
    private String uf;
    private String ibge;
    private String ddd;
    private String siafi;

    public AddressResponseDTO toAddressResponseDTO() {
        return AddressResponseDTO.builder()
                .cep(this.cep)
                .street(this.street)
                .additionalInfo(this.additionalInfo)
                .neighborhood(this.neighborhood)
                .locality(this.locality)
                .uf(this.uf)
                .ibge(this.ibge)
                .ddd(this.ddd)
                .siafi(this.siafi)
                .build();
    }
}
