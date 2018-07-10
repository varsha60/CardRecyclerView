package com.example.android.cardrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    //RecyclerView
    RecyclerView recyclerView;

    //List to store products
    List<Product> products;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Fetching the recyclerview and setting layout manager(horizontal or vertical)
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        products = new ArrayList<>();

        products.add(
                new Product (
                        1,
                        "13.3 inch, Silver, 1.35 kg",
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        R.drawable.macbook,
                        4.3,
                        60000


                )
        );

        products.add(
                new Product (
                        1,
                        "14 inch, Gray, 1.659 kg",
                        "Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)",
                        R.drawable.dellinspiration,
                        4.3,
                        60000


                )
        );
        products.add(
                new Product (
                        1,
                        "13.3 inch, Silver, 1.35 kg",
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        R.drawable.surface,
                        4.3,
                        60000


                )
        );
        products.add(
                new Product (
                        1,
                        "14 inch, Gray, 1.659 kg",
                        "Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)",
                        R.drawable.dellinspiration,
                        4.3,
                        60000


                )
        );
        products.add(
                new Product (
                        1,
                        "13.3 inch, Silver, 1.35 kg",
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        R.drawable.surface,
                        4.3,
                        60000


                )
        );
        products.add(
                new Product (
                        1,
                        "13.3 inch, Silver, 1.35 kg",
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        R.drawable.macbook,
                        4.3,
                        60000


                )
        );

       //Creating and setting the recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this,products);
        recyclerView.setAdapter(adapter);



    }
}
