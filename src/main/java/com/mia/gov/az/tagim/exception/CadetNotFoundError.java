package com.mia.gov.az.tagim.exception;

public class CadetNotFoundError extends RuntimeException{

    private int id;

    public CadetNotFoundError(int theId) {
        super("Cadet id :" + theId + "not found!");
        id=theId;
    }
}
