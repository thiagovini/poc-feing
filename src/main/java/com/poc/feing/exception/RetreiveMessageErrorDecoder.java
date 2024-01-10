package com.poc.feing.exception;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.io.InputStream;

public class RetreiveMessageErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder errorDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {

        switch (response.status()) {

            case 400:
                return new ResponseStatusException(HttpStatus.BAD_REQUEST);
            case 401:
                return new ResponseStatusException(HttpStatus.UNAUTHORIZED);
            case 404:
                return new ResponseStatusException(HttpStatus.NOT_FOUND);
            case 500:
                return new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
            case 503:
                return new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE);
            default:
                return errorDecoder.decode(methodKey, response);

        }
    }
}