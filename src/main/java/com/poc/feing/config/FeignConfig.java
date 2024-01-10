package com.poc.feing.config;

import com.poc.feing.exception.RetreiveMessageErrorDecoder;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

public class FeignConfig {
  @Bean
  public ErrorDecoder errorDecoder() {
    return new RetreiveMessageErrorDecoder();
  }

}