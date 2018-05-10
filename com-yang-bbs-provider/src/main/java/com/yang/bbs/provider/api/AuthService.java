package com.yang.bbs.provider.api;

import com.yang.bbs.provider.dto.LoginDTO;
import com.yang.bbs.provider.dto.SignUpDTO;
import com.yang.bbs.provider.dto.base.ApiArg;
import com.yang.bbs.provider.dto.base.ApiResult;

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