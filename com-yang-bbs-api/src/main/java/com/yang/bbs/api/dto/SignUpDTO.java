package com.yang.bbs.api.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author: yangqf
 * @date: 2018-05-10
 * @time: 14:44
 */
public interface SignUpDTO {

    @Data
    @ToString
    class Arg implements Serializable
    {
        private String email;

        private String account;

        private String name;

        private String password;

        private Integer gender;

        private String confirm;

        private String code;
    }

    @Data
    @ToString
    class Result implements Serializable
    {
    }
}
