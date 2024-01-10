package com.poc.feing.controller.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressResponseDTO {

    private String cep;
    private String street;
    private String additionalInfo;
    private String neighborhood;
    private String locality;
    private String uf;
    private String ibge;
    private String ddd;
    private String siafi;

}
