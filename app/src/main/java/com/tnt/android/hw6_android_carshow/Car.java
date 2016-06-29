package com.tnt.android.hw6_android_carshow;

import android.graphics.Bitmap;


public class Car {
    private Bitmap bitmap;
    private String text;
    private String url;

    public Car(String text, String url) {
        this.url = url;
        this.text = text;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
