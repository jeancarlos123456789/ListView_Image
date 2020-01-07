package com.example.listviewproyecto_imagen.models;

import java.util.ArrayList;

public class products {

    public String imagen;
    public String name;
    public String cantidad;

    public products(String _image,String _name, String _cant ){
        this.imagen = _image;
        this.name = _name;
        this.cantidad = _cant;


    }

    public String toString(){
        return this.name;
    }


    //datos ficticios
    public  static ArrayList<products> getData(){
        ArrayList<products> products = new ArrayList<>();
        products.add(new products("https://mymodernmet.com/wp/wp-content/uploads/archive/3Q0C5OhTPHpFbVJM6nJW_1065304567.jpeg",
                "Chaufan de pollo",
                "2"));
        products.add(new products("https://mymodernmet.com/wp/wp-content/uploads/archive/UIuU8p8tq0D3gbNs2IQn_1065304586.jpeg",
                "Chaufan de rez",
                "1"));
        products.add(new products("https://mymodernmet.com/wp/wp-content/uploads/archive/zvGRkNXKyYPJPf1c4AGz_1065304603.jpeg",
                "Chaufan de chancho",
                "2"));


        return products;
    }

    public String getSmallImage(){
        return this.imagen;
    }
}

