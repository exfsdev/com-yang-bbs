package com.yang.bbs.biz.vo.base;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author: yangqf
 * @date: 2018-05-10
 * @time: 17:35
 */
@Data
@ToString
public class WebApiResponse<T extends Serializable> implements Serializable {

    private int code;

    private String message;

    private boolean success;

    private T data;
}