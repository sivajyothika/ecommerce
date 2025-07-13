package com.ecommerce.sb_ecom.GlobalExceptionHandler;

public class APIException extends RuntimeException{
    public APIException(){

    }
    public APIException(String message){
        super(message);
    }
}
