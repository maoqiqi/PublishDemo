package com.codearms.maoqiqi.publish.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.codearms.maoqiqi.publish.ToastUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        ToastUtils.getInstance(this).showToast("我是 module publish 中的 ToastUtils 类");
    }
}