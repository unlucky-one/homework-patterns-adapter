package com.raiden.homework.pattern.adapter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Raiden
 * Date: 2019/3/18
 */
public class Adapter extends Display {
    boolean isUsb;

    public Adapter(boolean isUsb) {
        this.isUsb = isUsb;
    }

    @Override
    void hdmiInput() {
        if (isUsb) {
            System.out.println("USB转HDMI输入。");
        }else {
            super.hdmiInput();
        }
    }
}
