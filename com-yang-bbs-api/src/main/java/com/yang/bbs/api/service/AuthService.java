package com.yang.bbs.api.service;

import com.yang.bbs.api.dto.SignUpDTO;

/**
 * @author: yangqf
 * @date: 2018-05-10
 * @time: 14:42
 */
public interface AuthService {

    /**
     * user sign up
     * @param arg
     * @return
     */
    SignUpDTO.Result signUp(SignUpDTO.Arg arg);
}