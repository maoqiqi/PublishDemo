package com.codearms.maoqiqi.publish_1_3;

public class Publish {

    public static String getInfo() {
        return Publish.class.getName() + "中的getInfo()方法.";
    }

    public static String call2() {
        return "我是" + Publish.class.getName() + "中的call2方法;"
                + "调用了" + com.codearms.maoqiqi.publish_1_2.Publish.getInfo();
    }
}