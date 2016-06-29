package com.tnt.android.hw6_android_carshow;

import android.graphics.Bitmap;


public class Car {
    private Bitmap bitmap;
    private String brand;
    private String model;
    private String url;

    public Car(String brand, String model, String url) {
        setBrand(brand);
        setModel(model);
        setUrl(url);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
