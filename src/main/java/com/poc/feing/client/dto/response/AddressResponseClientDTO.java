package com.poc.feing.client.dto.response;

import com.poc.feing.entity.Address;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressResponseClientDTO {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String ddd;
    private String siafi;

    public Address toAddress() {
        return Address.builder()
                .cep(this.cep)
                .street(this.logradouro)
                .additionalInfo(this.complemento)
                .neighborhood(this.bairro)
                .locality(this.localidade)
                .uf(this.uf)
                .ibge(this.ibge)
                .ddd(this.ddd)
                .siafi(this.siafi)
                .build();
    }
}
