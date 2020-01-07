package com.example.listviewproyecto_imagen.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;

import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.listviewproyecto_imagen.R;
import com.example.listviewproyecto_imagen.models.products;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends ArrayAdapter<products> {
    Context context;
    ImageLoader queue;

    private class ViewHolder {
        NetworkImageView image;
        //TextView image;
        TextView name;
        TextView cantidad;
        //TextView category;
        //ImageButton btnAddToBag;

        private ViewHolder() {
        }
    }
    public ProductAdapter(Context context, List<products> items , ImageLoader _queue) {
        super(context, 0, items);
        this.context = context;
        this.queue = _queue;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        final products rowItem = (products) getItem(position);
        LayoutInflater mInflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.adapter_products_item, null);
            holder = new ViewHolder();
//            holder.image = (ImageView) convertView.findViewById(R.id.image);
            holder.image = (NetworkImageView)convertView.findViewById(R.id.image);
            // holder.image = (TextView) convertView.findViewById(R.id.imagen);
            holder.name = (TextView) convertView.findViewById(R.id.name);
            holder.cantidad = (TextView) convertView.findViewById(R.id.cantidad);
            //holder.price = (TextView) convertView.findViewById(R.id.price);
            // holder.description = (TextView) convertView.findViewById(R.id.description);
            //holder.category = (TextView) convertView.findViewById(R.id.category);
            // holder.btnAddToBag = (ImageButton) convertView.findViewById(R.id.btnAddToBag);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        //holder.image.setText(rowItem.imagen);

        holder.name.setText(rowItem.name+"...");
        holder.cantidad.setText(rowItem.cantidad);
        //holder.price.setText(rowItem.getPriceText());
        // holder.description.setText(rowItem.descripcion);
        // holder.category.setText(rowItem.getCategory());

       if ( rowItem.getSmallImage() != null ) {
            holder.image.setImageUrl(
                    rowItem.getSmallImage(), queue);
        }
      /*  holder.btnAddToBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProductListActivity activity = (ProductListActivity) context;
                activity.selectProduct(position);
            }
        });*/



//        holder.image.setImageBitmap(rowItem.getSmallBitMap());
        return convertView;
    }

}
