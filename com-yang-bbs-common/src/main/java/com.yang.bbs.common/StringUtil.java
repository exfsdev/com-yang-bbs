package com.yang.bbs.common;

/**
 * @author: yangqf
 * @date: 2018-05-10
 * @time: 15:29
 */
public class StringUtil {

    public static boolean isNullOrEmpty(String arg) {
        if (arg == null) {
            return true;
        }
        if (arg.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isNullOrSpace(String arg) {
        if (isNullOrEmpty(arg)) {
            return true;
        }
        if (arg.trim().length() == 0) {
            return true;
        }
        return false;
    }
}
