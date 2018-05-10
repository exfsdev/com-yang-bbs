package com.yang.bbs.common;

/**
 * @author: yangqf
 * @date: 2018-05-10
 * @time: 15:29
 */
public class StringUtil {

    private static String MAIL_REGEX = "\\w+(\\.\\w)*@\\w+(\\.\\w{2,3}){1,3}";

    private static String ACCOUNT_REGEX = "[a-zA-Z]{1}[a-zA-Z0-9_]{1,15}";

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

    public static boolean isEmail(String arg) {
        return arg.matches(MAIL_REGEX);
    }

    public static boolean isAccount(String arg) {
        return arg.matches(ACCOUNT_REGEX);
    }
}
