package com.example.rocknrollalbumart.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "Error Response Model")
public class ErrorResponse implements Serializable {

    private static final Double serialVersionUID = 0.1;
    @ApiModelProperty(notes="Error Code", name = "code", value = "200")
    private int code;
    @ApiModelProperty(notes="Status", name = "message", value = "SUCCESS")
    private String status;
    @ApiModelProperty(notes="message", name = "message", value = "Invalid field")
    private String message;

    public static Double getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
