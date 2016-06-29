package com.tnt.android.hw6_android_carshow;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.IOException;
import java.net.URL;

/**
 * Created by USER on 29.6.2016 г..
 */
public class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {


    private ImageView imgView;

    public DownloadImageTask(ImageView imgView) {
        this.imgView = imgView;
    }

    @Override
    protected Bitmap doInBackground(String... params) {
        URL url = null;
        Bitmap bmp = null;

        try {
            url = new URL(params[0]);
            bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }


        return bmp;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
        imgView.setImageBitmap(bitmap);
    }
}