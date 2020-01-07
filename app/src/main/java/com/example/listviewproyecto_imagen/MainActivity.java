package com.example.listviewproyecto_imagen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.listviewproyecto_imagen.Adapter.ProductAdapter;
import com.example.listviewproyecto_imagen.helpers.QueueUtils;
import com.example.listviewproyecto_imagen.models.products;

public class MainActivity extends AppCompatActivity {
    ProductAdapter ProductAdapter;
    QueueUtils.QueueObject queue = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        queue = QueueUtils.getInstance(this.getApplicationContext());

        ProductAdapter =
                new ProductAdapter(this, products.getData(),
                        queue.getImageLoader());
    }
}
