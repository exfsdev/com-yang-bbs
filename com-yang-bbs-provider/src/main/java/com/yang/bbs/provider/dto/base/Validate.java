package com.yang.bbs.provider.dto.base;

import com.yang.bbs.provider.dto.exception.ValidateException;

/**
 * @author: yangqf
 * @date: 2018-05-10
 * @time: 15:16
 */
public interface Validate {

    /**
     * validate arg
     *
     * @throws ValidateException
     */
    void validate() throws ValidateException;
}
