package com.raiden.homework.pattern.adapter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Raiden
 * Date: 2019/3/18
 */
public class Display {

    void hdmiInput() {
        System.out.println("HDMI输入！");
    }

    public void play() {
        hdmiInput();
    }
}
