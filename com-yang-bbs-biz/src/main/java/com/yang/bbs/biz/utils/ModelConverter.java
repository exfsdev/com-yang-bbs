package com.yang.bbs.biz.utils;

import com.yang.bbs.provider.dto.SignUpDTO;
import com.yang.bbs.biz.vo.SignUpVO;

/**
 * @author: yangqf
 * @date: 2018-05-10
 * @time: 17:38
 */
public class ModelConverter {

    public static SignUpDTO.Arg toSignUpArg(SignUpVO.Request arg) {
        if (arg == null) {
            return null;
        }
        SignUpDTO.Arg rst = new SignUpDTO.Arg();
        rst.setEmail(arg.getEmail());
        rst.setAccount(arg.getAccount());
        rst.setName(arg.getName());
        rst.setPassword(arg.getPassword());
        rst.setGender(arg.getGender());
        rst.setConfirm(arg.getConfirm());
        rst.setCode(arg.getCode());
        return rst;
    }
}
