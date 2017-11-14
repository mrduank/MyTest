package com.example.dk.mytest.utils;

import android.util.Log;

/**
 * Created by dk on 2017/8/14.
 */

public class LogUtil {
    private static boolean DE_BUG = true; //调试开关
    private static final String TAG = "CS---------------------";

    public static void debugLog(String str) {
        if (DE_BUG) {
            System.out.println(str);
        }
    }

    public static void debugLog(String str, Object... s) {
        str = String.format(str, s);
        debugLog(str);
    }

    // 下面四个是默认tag的函数
    public static void i(String msg) {
        if (DE_BUG)
            Log.i(TAG, msg);
    }

    public static void d(String msg) {
        if (DE_BUG)
            Log.d(TAG, msg);
    }

    public static void e(String msg) {
        if (DE_BUG)
            Log.e(TAG, msg);
    }

    public static void v(String msg) {
        if (DE_BUG)
            Log.v(TAG, msg);
    }


    // 下面是传入自定义tag的函数
    public static void i(String tag, String msg) {
        if (DE_BUG)
            Log.i(tag, msg);
    }

    public static void d(String tag, String msg) {
        if (DE_BUG)
            Log.d(tag, msg);
    }

    public static void e(String tag, String msg) {
        if (DE_BUG)
            Log.e(tag, msg);
    }

    public static void v(String tag, String msg) {
        if (DE_BUG)
            Log.v(tag, msg);
    }
}
