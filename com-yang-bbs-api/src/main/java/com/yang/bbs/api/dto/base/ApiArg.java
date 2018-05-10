package com.yang.bbs.api.dto.base;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author: yangqf
 * @date: 2018-05-10
 * @time: 15:15
 */
@Data
@ToString
public class ApiArg<T extends Validate> implements Serializable {

    /**
     * current user id
     */
    private String userId;

    private T data;
}
