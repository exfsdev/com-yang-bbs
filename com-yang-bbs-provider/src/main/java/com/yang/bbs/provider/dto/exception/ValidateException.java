package com.yang.bbs.provider.dto.exception;

/**
 * @author yangqf
 */
public class ValidateException extends Exception {

    private final int code;

    public ValidateException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ValidateException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }

    public ValidateException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
