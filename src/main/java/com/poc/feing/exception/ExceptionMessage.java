package com.poc.feing.exception;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ExceptionMessage {

    private Timestamp timestamp;
    private String message;
}
