package com.example.androiddbsimple.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androiddbsimple.R;
import com.example.androiddbsimple.models.Item;

import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ItemViewHolder> {

    public static final String TAG = "ItemListAdapter";
    ArrayList<Item> itemArrayList;

    public ItemListAdapter(ArrayList<Item> items) {
        this.itemArrayList = items;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.single_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        Log.d(TAG, "onBindViewHolder: "+position);

        Item item = itemArrayList.get(position);
        holder.itemName.setText(item.getName());

    }

    @Override
    public int getItemCount() {
        return itemArrayList.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        TextView itemName;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            itemName = itemView.findViewById(R.id.textViewItemName);


        }
    }
}
