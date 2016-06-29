package com.tnt.android.hw6_android_carshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.rec_view)
    RecyclerView recView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("VW", "https://pixabay.com/static/uploads/photo/2015/09/23/10/20/car-953357_960_720.png"));
        cars.add(new Car("Opel", "https://pixabay.com/static/uploads/photo/2015/09/23/10/20/car-953357_960_720.png"));
        cars.add(new Car("VW", "https://pixabay.com/static/uploads/photo/2015/09/23/10/20/car-953357_960_720.png"));
        cars.add(new Car("Honda", "https://pixabay.com/static/uploads/photo/2015/09/23/10/20/car-953357_960_720.png"));
        cars.add(new Car("VW", "https://pixabay.com/static/uploads/photo/2015/09/23/10/20/car-953357_960_720.png"));
        cars.add(new Car("VW", "https://pixabay.com/static/uploads/photo/2015/09/23/10/20/car-953357_960_720.png"));
        cars.add(new Car("VW", "https://pixabay.com/static/uploads/photo/2015/09/23/10/20/car-953357_960_720.png"));
        cars.add(new Car("VW", "https://pixabay.com/static/uploads/photo/2015/09/23/10/20/car-953357_960_720.png"));

        recView.setLayoutManager(new LinearLayoutManager(this));
        recView.setAdapter(new CarAdapter(this, cars));
    }
}
