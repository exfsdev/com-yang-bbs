package com.yang.bbs.provider.service.base;



import com.yang.bbs.provider.dto.base.ApiResult;

import java.io.Serializable;

/**
 * @author yangqf
 */
public abstract class ServiceBase {

    private static final int SUCCESS_CODE = 0;

    private static final String SUCCESS_MESSAGE = "success";

    /**
     * set success data
     *
     * @param data success data
     * @param <T>  type of result data
     * @return
     */
    protected <T extends Serializable> ApiResult<T> setSuccess(T data) {
        ApiResult<T> result = new ApiResult<>();
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
    protected <T extends Serializable> ApiResult<T> setFailure(int code, String message) {
        ApiResult<T> result = new ApiResult<>();
        result.setCode(code);
        result.setMessage(message);
        result.setSuccess(false);
        return result;
    }
}
