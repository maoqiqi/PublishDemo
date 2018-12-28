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

        TextView info = findViewById(R.id.info);
        msg = findViewById(R.id.msg);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("APPLICATION_ID:");
        stringBuffer.append(com.codearms.maoqiqi.publish.BuildConfig.APPLICATION_ID);
        stringBuffer.append("\n");
        stringBuffer.append("VERSION_CODE:");
        stringBuffer.append(com.codearms.maoqiqi.publish.BuildConfig.VERSION_CODE);
        stringBuffer.append("\n");
        stringBuffer.append("VERSION_NAME:");
        stringBuffer.append(com.codearms.maoqiqi.publish.BuildConfig.VERSION_NAME);
        stringBuffer.append("\n");
        stringBuffer.append("\n");

        stringBuffer.append("APPLICATION_ID:");
        stringBuffer.append(com.codearms.maoqiqi.publish_1_1.BuildConfig.APPLICATION_ID);
        stringBuffer.append("\n");
        stringBuffer.append("VERSION_CODE:");
        stringBuffer.append(com.codearms.maoqiqi.publish_1_1.BuildConfig.VERSION_CODE);
        stringBuffer.append("\n");
        stringBuffer.append("VERSION_NAME:");
        stringBuffer.append(com.codearms.maoqiqi.publish_1_1.BuildConfig.VERSION_NAME);
        stringBuffer.append("\n");
        stringBuffer.append("\n");

        stringBuffer.append("APPLICATION_ID:");
        stringBuffer.append(com.codearms.maoqiqi.publish_1_2.BuildConfig.APPLICATION_ID);
        stringBuffer.append("\n");
        stringBuffer.append("VERSION_CODE:");
        stringBuffer.append(com.codearms.maoqiqi.publish_1_2.BuildConfig.VERSION_CODE);
        stringBuffer.append("\n");
        stringBuffer.append("VERSION_NAME:");
        stringBuffer.append(com.codearms.maoqiqi.publish_1_2.BuildConfig.VERSION_NAME);
        stringBuffer.append("\n");
        stringBuffer.append("\n");

        stringBuffer.append("APPLICATION_ID:");
        stringBuffer.append(com.codearms.maoqiqi.publish_1_3.BuildConfig.APPLICATION_ID);
        stringBuffer.append("\n");
        stringBuffer.append("VERSION_CODE:");
        stringBuffer.append(com.codearms.maoqiqi.publish_1_3.BuildConfig.VERSION_CODE);
        stringBuffer.append("\n");
        stringBuffer.append("VERSION_NAME:");
        stringBuffer.append(com.codearms.maoqiqi.publish_1_3.BuildConfig.VERSION_NAME);
        stringBuffer.append("\n");
        stringBuffer.append("\n");

        stringBuffer.append("APPLICATION_ID:");
        stringBuffer.append(com.codearms.maoqiqi.publish_2.BuildConfig.APPLICATION_ID);
        stringBuffer.append("\n");
        stringBuffer.append("VERSION_CODE:");
        stringBuffer.append(com.codearms.maoqiqi.publish_2.BuildConfig.VERSION_CODE);
        stringBuffer.append("\n");
        stringBuffer.append("VERSION_NAME:");
        stringBuffer.append(com.codearms.maoqiqi.publish_2.BuildConfig.VERSION_NAME);

        info.setText(stringBuffer.toString());
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