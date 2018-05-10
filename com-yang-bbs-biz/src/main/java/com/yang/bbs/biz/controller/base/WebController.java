package com.yang.bbs.biz.controller.base;

import com.yang.bbs.biz.vo.base.WebApiResponse;

import java.io.Serializable;

/**
 * @author: yangqf
 * @date: 2018-05-10
 * @time: 17:56
 */
public class WebController {

    private static final int SUCCESS_CODE = 0;

    private static final String SUCCESS_MESSAGE = "success";

    /**
     * set success data
     *
     * @param data success data
     * @param <T>  type of result data
     * @return
     */
    protected <T extends Serializable> WebApiResponse<T> setSuccess(T data) {
        WebApiResponse<T> result = new WebApiResponse<>();
        result.setData(data);
        result.setCode(SUCCESS_CODE);
        result.setMessage(SUCCESS_MESSAGE);
        result.setSuccess(true);
        return result;
    }

    /**
     * set error message
     *
     * @param code    [error code]
     * @param message [error message]
     * @param <T>     type of result data
     * @return
     */
    protected <T extends Serializable> WebApiResponse<T> setFailure(int code, String message) {
        WebApiResponse<T> result = new WebApiResponse<>();
        result.setCode(code);
        result.setMessage(message);
        result.setSuccess(false);
        return result;
    }
}
