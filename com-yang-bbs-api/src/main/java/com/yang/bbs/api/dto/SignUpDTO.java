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
 * @time: 14:44
 * <p>
 * sign up args
 */
public interface SignUpDTO {

    @Data
    @ToString
    class Arg implements Serializable, Validate {
        private String email;

        private String account;

        private String name;

        private String password;

        private Integer gender;

        private String confirm;

        private String code;

        public void validate() throws ValidateException {
            if (StringUtil.isNullOrSpace(email)) {
                throw new ValidateException(0, "Please fill out the e-mail.");
            }
            if (StringUtil.isNullOrSpace(account)) {
                throw new ValidateException(0, "Please fill out the account.");
            }
            if (StringUtil.isNullOrSpace(name)) {
                throw new ValidateException(0, "Please fill out the nick name.");
            }
            if (StringUtil.isNullOrSpace(password)) {
                throw new ValidateException(0, "Please fill out the password.");
            }
            if (StringUtil.isNullOrSpace(confirm)) {
                throw new ValidateException(0, "Please fill out the password confirm.");
            }
            if (StringUtil.isNullOrSpace(code)) {
                throw new ValidateException(0, "Please fill out the e-mail validate code.");
            }
        }
    }

    @Data
    @ToString
    class Result implements Serializable {
    }
}
