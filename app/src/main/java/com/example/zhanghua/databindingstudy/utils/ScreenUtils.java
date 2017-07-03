package com.example.zhanghua.databindingstudy.utils;

import android.content.Context;

/**
 * Created by ZhangHua on 03/07/2017.
 */

public class ScreenUtils {

    public static float dp2px(Context context, float dpValue) {
        return dpValue * context.getResources().getDisplayMetrics().density;
    }
}
