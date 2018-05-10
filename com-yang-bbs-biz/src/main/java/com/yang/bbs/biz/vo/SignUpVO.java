package com.yang.bbs.biz.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author: yangqf
 * @date: 2018-05-10
 * @time: 17:32
 */
public interface SignUpVO {

    @Data
    @ToString
    @ApiModel(value = "SignUpVO.Request")
    class Request implements Serializable {

        @ApiModelProperty(value = "email", dataType = "String", example = "123456789@qq.com")
        private String email;

        @ApiModelProperty(value = "account", dataType = "String", example = "yangqf")
        private String account;

        @ApiModelProperty(value = "name", dataType = "String", example = "Erich")
        private String name;

        @ApiModelProperty(value = "password", dataType = "String", example = "P@ssW0rd")
        private String password;

        @ApiModelProperty(value = "gender", dataType = "Integer", example = "1")
        private Integer gender;

        @ApiModelProperty(value = "confirm", dataType = "String", example = "P@ssW0rd")
        private String confirm;

        @ApiModelProperty(value = "code", dataType = "String", example = "L23XOP9S")
        private String code;
    }

    @Data
    @ToString
    @ApiModel(value = "SignUpVO.Response")
    class Response implements Serializable {

    }
}
