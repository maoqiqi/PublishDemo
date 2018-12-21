package com.codearms.maoqiqi.publish;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;

public class ToastUtils {

    private Toast toast;
    private static ToastUtils toastUtils;

    @SuppressLint("ShowToast")
    private ToastUtils(Context context) {
        toast = Toast.makeText(context.getApplicationContext(), null, Toast.LENGTH_SHORT);
    }

    public static synchronized ToastUtils getInstance(Context context) {
        if (toastUtils == null) {
            synchronized (ToastUtils.class) {
                if (toastUtils == null) {
                    toastUtils = new ToastUtils(context);
                }
            }
        }
        return toastUtils;
    }

    public void showToast(int msg) {
        toast.setText(msg);
        toast.show();
    }

    public void showToast(String msg) {
        toast.setText(msg);
        toast.show();
    }

    public void destory() {
        if (toast != null) {
            toast.cancel();
            toast = null;
        }
        toastUtils = null;
    }
}