package com.myuluo.textgit;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.Gravity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

/**
 * Created by Myuluo on 2016-08-27.
 * <p>
 * 用来保存一些全局常量的类
 */
public class ApiInterface {

    /**
     * 吐司通知
     */
    public static void Toast(Context context, String message) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
