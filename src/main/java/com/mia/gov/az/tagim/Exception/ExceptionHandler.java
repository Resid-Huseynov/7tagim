package com.mia.gov.az.tagim.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(CadetNotFoundError.class)
    public ResponseEntity<String> cadetNotFound(CadetNotFoundError error) {

        return ResponseEntity.ok(error.getMessage());
    }
}
