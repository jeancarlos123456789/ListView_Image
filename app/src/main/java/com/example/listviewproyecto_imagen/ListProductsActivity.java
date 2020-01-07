package com.example.listviewproyecto_imagen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.listviewproyecto_imagen.Adapter.ProductAdapter;
import com.example.listviewproyecto_imagen.helpers.QueueUtils;
import com.example.listviewproyecto_imagen.models.products;

public class ListProductsActivity extends AppCompatActivity {
    ListView productList;
    QueueUtils.QueueObject queue = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list_products);

        productList = findViewById(R.id.listaproductos);

        queue = QueueUtils.getInstance(this.getApplicationContext());

        ProductAdapter adapter = new ProductAdapter(
                this, products.getData(),queue.getImageLoader());

        productList.setAdapter(adapter);
    }
}
