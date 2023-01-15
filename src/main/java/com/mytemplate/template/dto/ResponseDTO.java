package com.mytemplate.template.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.mytemplate.template.exception.SampleException;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude
public class ResponseDTO<T> implements Serializable {

    private ResultObject result;

    private T data;

    public ResponseDTO(T data) {
        this.data = data;
    }

    public ResponseDTO(ResultObject result) {
        this.result = result;
    }

    public static <T> ResponseDTO<T> ok() {
        return new ResponseDTO<>(ResultObject.getSuccess());
    }

    public static <T> ResponseDTO<T> ok(T data) {
        return new ResponseDTO<>(ResultObject.getSuccess(), data);
    }

    public static <T> ResponseDTO<T> response(T data) {
        return new ResponseDTO<>(ResultObject.getSuccess(), data);
    }

    public ResponseDTO(SampleException ex) {
        this.result = new ResultObject(ex);
    }
}
