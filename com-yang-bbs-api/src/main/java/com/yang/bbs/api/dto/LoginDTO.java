package com.yang.bbs.api.dto;

import com.yang.bbs.api.dto.base.Validate;
import com.yang.bbs.api.dto.exception.ValidateException;
import com.yang.bbs.common.StringUtil;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author: yangqf
 * @date: 2018-05-10
 * @time: 15:24
 */
public interface LoginDTO {

    @Data
    @ToString
    class Arg implements Serializable, Validate {
        private String account;

        private String password;

        @Override
        public void validate() throws ValidateException {
            if (StringUtil.isNullOrSpace(account)) {
                throw new ValidateException(0, "Please fill out the account.");
            }
            if (StringUtil.isNullOrSpace(password)) {
                throw new ValidateException(0, "Please fill out the password.");
            }
        }
    }

    @Data
    @ToString
    class Result implements Serializable {
    }
}
