package com.codearms.maoqiqi.publish.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.codearms.maoqiqi.publish.ToastUtils;

public class MainActivity extends AppCompatActivity {

    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg = findViewById(R.id.msg);
    }

    public void onClick(View view) {
        ToastUtils.getInstance(this).showToast("我是 module publish 中的 ToastUtils 类");
    }

    public void publish1(View view) {
        msg.setText(com.codearms.maoqiqi.publish_1_1.Publish.call2());
    }

    public void publish3(View view) {
        msg.setText(com.codearms.maoqiqi.publish_1_3.Publish.call2());
    }

    public void getInfo(View view) {
        msg.setText(com.codearms.maoqiqi.publish_2.Publish.getInfo());
    }
}