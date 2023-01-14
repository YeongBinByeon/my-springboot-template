package com.mytemplate.template.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SampleException extends RuntimeException{

    private ErrorCode errorCode;
    private String message;

    public SampleException(ErrorCode errorCode) {
        this.errorCode = errorCode;
        this.message = null;
    }

    public String getMessage(){
        if(message == null){
            return errorCode.getMessage();
        }

        return String.format("%s %s", errorCode.getMessage());
    }
}
