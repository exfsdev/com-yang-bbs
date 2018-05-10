package com.yang.bbs.provider.dto.base;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author: yangqf
 * @date: 2018-05-10
 * @time: 15:13
 */
@ToString
@Data
public class ApiResult<T extends Serializable> implements Serializable {

    private int code;

    private String message;

    private boolean success;

    private T data;
}
