package com.example.rocknrollalbumart.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(description = "Error Response Model")
public @Data class ErrorResponse implements Serializable {

    private static final Double serialVersionUID = 0.1;
    @ApiModelProperty(notes="Error Code", name = "code", value = "200")
    private int code;
    @ApiModelProperty(notes="Status", name = "message", value = "SUCCESS")
    private String status;
    @ApiModelProperty(notes="message", name = "message", value = "Invalid field")
    private String message;

}
