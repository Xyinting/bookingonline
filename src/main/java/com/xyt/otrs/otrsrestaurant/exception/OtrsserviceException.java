package com.xyt.otrs.otrsrestaurant.exception;

import lombok.Getter;

@Getter
public class OtrsserviceException extends RuntimeException {

    private int code;

    public OtrsserviceException(int code , String message) {
        super(message);
        this.code = code;
    }
}
