package com.example.android.cardrecyclerview;

//RecyclerView.adapter Binds the view
//RecyclerView.viewHolder Holds the view

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductHolder> {

    private Context mCtx;
private List<Product> products;

    public ProductAdapter(Context mCtx, List<Product> products) {
        this.mCtx = mCtx;
        this.products = products;
    }

    //This function will return the instance of ProductHolder class i.e viewholder(UI Elements)

    @Override
    public ProductHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_item,null);
        ProductHolder holder = new ProductHolder(view);
        return holder;

    }

    //This funtion will bind everything and will return nothing
    @Override
    public void onBindViewHolder(ProductHolder holder, int position) {

  Product product = products.get(position);
  holder.textViewTitle.setText(product.getTitle());
  holder.textViewDesc.setText(product.getShortDesc());
  holder.textViewRating.setText(String.valueOf(product.getRatings()));
  holder.textViewPrice.setText(String.valueOf(product.getPrice()));
  holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));
    }

    //This will return the number of items in the list
    @Override
    public int getItemCount() {
        return products.size();
    }

    class ProductHolder extends RecyclerView.ViewHolder
    {
           ImageView imageView;
           TextView textViewTitle, textViewDesc, textViewRating, textViewPrice;

        public ProductHolder(View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }

}


