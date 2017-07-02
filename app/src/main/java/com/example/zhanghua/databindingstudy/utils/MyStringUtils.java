package com.example.zhanghua.databindingstudy.utils;

/**
 * Created by ZhangHua on 02/07/2017.
 */

public class MyStringUtils {
    public static String capitalize(final String word) {
        if (word.length() > 1) {
            return String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
        }
        return word;
    }
}
