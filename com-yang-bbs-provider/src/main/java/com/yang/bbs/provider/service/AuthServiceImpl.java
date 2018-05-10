package com.yang.bbs.provider.service;

import com.yang.bbs.provider.dto.LoginDTO;
import com.yang.bbs.provider.dto.SignUpDTO;
import com.yang.bbs.provider.dto.base.ApiArg;
import com.yang.bbs.provider.dto.base.ApiResult;
import com.yang.bbs.provider.api.AuthService;
import com.yang.bbs.provider.service.base.ServiceBase;

/**
 * @author: yangqf
 * @date: 2018-05-10
 * @time: 16:02
 */
public class AuthServiceImpl extends ServiceBase implements AuthService {

    @Override
    public ApiResult<SignUpDTO.Result> signUp(ApiArg<SignUpDTO.Arg> arg) {
        return setSuccess(new SignUpDTO.Result());
    }

    @Override
    public ApiResult<LoginDTO.Result> login(ApiArg<LoginDTO.Arg> arg) {
        return setSuccess(new LoginDTO.Result());
    }
}
