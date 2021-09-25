package com.example.surosasupercenter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProviderClient;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity
{
    private ImageView VegeandFruits, shampoo;
    private ImageView households, groceries;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);


        VegeandFruits = (ImageView) findViewById(R.id.veg_fruits);
        shampoo = (ImageView) findViewById(R.id.h_shampoo);
        
        households = (ImageView) findViewById(R.id.house_holds);
        groceries = (ImageView) findViewById(R.id.grocery_items);

        VegeandFruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category",  "VegeandFruits");
                startActivity(intent);

            }
        });

        shampoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra(  "category",  "shampoo");
                startActivity(intent);

            }
        });

        households.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra( name: "category", value: "households");
                startActivity(intent);

            }
        });

        groceries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra( name: "category", value: "groceries");
                startActivity(intent);

            }
        });

    }
}