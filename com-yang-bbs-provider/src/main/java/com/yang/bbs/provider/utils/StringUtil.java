package com.yang.bbs.provider.utils;

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
        return arg.length() == 0;
    }

    public static boolean isNullOrSpace(String arg) {
        if (isNullOrEmpty(arg)) {
            return true;
        }
        return arg.trim().length() == 0;
    }

    public static boolean isEmail(String arg) {
        String mailRegex = "\\w+(\\.\\w)*@\\w+(\\.\\w{2,3}){1,3}";
        return arg.matches(mailRegex);
    }

    public static boolean isAccount(String arg) {
        String accountRegex = "[a-zA-Z]{1}[a-zA-Z0-9_]{1,15}";
        return arg.matches(accountRegex);
    }
}
