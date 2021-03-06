package com.yang.bbs.provider.dto;

import com.yang.bbs.provider.dto.base.Validate;
import com.yang.bbs.provider.dto.exception.ValidateException;
import com.yang.bbs.provider.utils.StringUtil;
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

        private static final int NAME_MAX_LENGTH = 6;

        private static final int NAME_MIN_LENGTH = 2;

        private String email;

        private String account;

        private String name;

        private String password;

        private Integer gender;

        private String confirm;

        private String code;

        @Override
        public void validate() throws ValidateException {
            if (StringUtil.isNullOrSpace(email)) {
                throw new ValidateException(1, "Please fill out the e-mail.");
            }
            if (StringUtil.isNullOrSpace(account)) {
                throw new ValidateException(2, "Please fill out the account.");
            }
            if (StringUtil.isNullOrSpace(name)) {
                throw new ValidateException(3, "Please fill out the nick name.");
            }
            if (StringUtil.isNullOrSpace(password)) {
                throw new ValidateException(4, "Please fill out the password.");
            }
            if (StringUtil.isNullOrSpace(confirm)) {
                throw new ValidateException(5, "Please fill out the password confirm.");
            }
            if (StringUtil.isNullOrSpace(code)) {
                throw new ValidateException(6, "Please fill out the e-mail validate code.");
            }
            if (!StringUtil.isEmail(email)) {
                throw new ValidateException(1, "E-mail address format error.");
            }
            if (!StringUtil.isAccount(account)) {
                throw new ValidateException(1, "Account format error.");
            }
            if (name.length() > NAME_MAX_LENGTH || name.length() < NAME_MIN_LENGTH) {
                throw new ValidateException(1, "Name format error.");
            }
            if (!password.equals(confirm)) {
                throw new ValidateException(1, "Password confirm error.");
            }
        }
    }

    @Data
    @ToString
    class Result implements Serializable {
    }
}
