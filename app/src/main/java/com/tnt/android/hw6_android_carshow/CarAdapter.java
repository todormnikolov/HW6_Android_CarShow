package com.tnt.android.hw6_android_carshow;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by USER on 15.6.2016 г..
 */
public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarHolder> {

    List<Car> cars;

    public CarAdapter(MainActivity mainActivity, List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public CarHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_item, parent, false);
        CarHolder holder = new CarHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(CarHolder holder, int position) {
        Car car = cars.get(position);
        holder.txtText.setText(car.getText());
        holder.imgView.setImageBitmap(car.getBitmap());
        new DownloadImageTask(holder.imgView).execute(car.getUrl());
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public class CarHolder extends RecyclerView.ViewHolder {

        TextView txtText;
        ImageView imgView;

        public CarHolder(View itemView) {
            super(itemView);
            txtText = (TextView) itemView.findViewById(R.id.txt_text);
            imgView = (ImageView) itemView.findViewById(R.id.img_view);
        }
    }
}
