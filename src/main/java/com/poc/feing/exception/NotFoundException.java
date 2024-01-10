package com.poc.feing.exception;

public class NotFoundException extends RuntimeException{

    public NotFoundException(String cep) {
        super(String.format("cep %s not found", cep));
    }
}
