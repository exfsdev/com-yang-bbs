package com.yang.bbs.api.service;

import com.yang.bbs.api.dto.LoginDTO;
import com.yang.bbs.api.dto.SignUpDTO;
import com.yang.bbs.api.dto.base.ApiArg;
import com.yang.bbs.api.dto.base.ApiResult;

/**
 * @author: yangqf
 * @date: 2018-05-10
 * @time: 14:42
 */
public interface AuthService {

    /**
     * user sign up
     *
     * @param arg
     * @return
     */
    ApiResult<SignUpDTO.Result> signUp(ApiArg<SignUpDTO.Arg> arg);

    /**
     * user login
     *
     * @param arg
     * @return
     */
    ApiResult<LoginDTO.Result> login(ApiArg<LoginDTO.Arg> arg);
}