package com.yang.bbs.biz.controller;

import com.yang.bbs.provider.dto.SignUpDTO;
import com.yang.bbs.provider.dto.base.ApiArg;
import com.yang.bbs.provider.dto.base.ApiResult;
import com.yang.bbs.provider.api.AuthService;
import com.yang.bbs.biz.controller.base.WebController;
import com.yang.bbs.biz.vo.SignUpVO;
import com.yang.bbs.biz.vo.base.WebApiResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: yangqf
 * @date: 2018-05-10
 * @time: 17:26
 */
@Api(value = "auth", description = "auth controller")
@Controller
@RequestMapping("/auth")
public class AuthController extends WebController {

    @Autowired
    private AuthService authService;

    @ApiOperation(
            value = "sign up",
            httpMethod = "POST",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @RequestMapping("/signUp")
    public WebApiResponse<SignUpVO.Response> signUp(@RequestBody SignUpVO.Request request) {
        SignUpDTO.Arg arg = new SignUpDTO.Arg();
        arg.setEmail(request.getEmail());
        arg.setAccount(request.getAccount());
        arg.setName(request.getName());
        arg.setPassword(request.getPassword());
        arg.setGender(request.getGender());
        arg.setConfirm(request.getConfirm());
        arg.setCode(request.getCode());

        ApiArg<SignUpDTO.Arg> apiArg = new ApiArg<>();
        apiArg.setUserId("");
        apiArg.setData(arg);

        ApiResult<SignUpDTO.Result> rst = authService.signUp(apiArg);

        if (rst.isSuccess()) {
            return setSuccess(new SignUpVO.Response());
        } else {
            return setFailure(rst.getCode(), rst.getMessage());
        }
    }
}
