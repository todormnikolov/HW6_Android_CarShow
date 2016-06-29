package com.tnt.android.hw6_android_carshow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

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

        final List<Car> cars = new ArrayList<>();
        cars.add(new Car("VW", "Beetle", "https://pixabay.com/static/uploads/photo/2015/09/23/10/20/car-953357_960_720.png"));
        cars.add(new Car("Opel", "Zafira", "https://pixabay.com/static/uploads/photo/2015/09/23/10/20/car-953357_960_720.png"));
        cars.add(new Car("VW", "Caravan", "https://pixabay.com/static/uploads/photo/2015/09/23/10/20/car-953357_960_720.png"));
        cars.add(new Car("Honda", "Civic", "https://pixabay.com/static/uploads/photo/2015/09/23/10/20/car-953357_960_720.png"));
        cars.add(new Car("BMW", "320i", "http://blog.caranddriver.com/wp-content/uploads/2015/11/BMW-2-series.jpg"));
        cars.add(new Car("BMW", "330d", "http://blog.caranddriver.com/wp-content/uploads/2015/11/BMW-2-series.jpg"));
        cars.add(new Car("Mercedes", "C220", "https://pixabay.com/static/uploads/photo/2015/09/23/10/20/car-953357_960_720.png"));
        cars.add(new Car("BMW", "530d", "http://blog.caranddriver.com/wp-content/uploads/2015/11/BMW-2-series.jpg"));

        recView.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Car car = cars.get(position);
                        String brand = car.getBrand();
                        String model = car.getModel();

                        Intent intent = new Intent(MainActivity.this, CarDetailsActivity.class);
                        intent.putExtra("brand", brand);
                        intent.putExtra("model", model);
                        startActivity(intent);
                    }
                })
        );

        recView.setLayoutManager(new LinearLayoutManager(this));
        recView.setAdapter(new CarAdapter(this, cars));
    }
}
