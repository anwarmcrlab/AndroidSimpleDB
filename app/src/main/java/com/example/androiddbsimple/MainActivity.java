package com.example.androiddbsimple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.androiddbsimple.adapter.ItemListAdapter;
import com.example.androiddbsimple.models.Item;
import com.example.androiddbsimple.models.ItemList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView itemRecyclerView;
    private ItemListAdapter itemListAdapter;
    private static String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemRecyclerView = findViewById(R.id.itemRecyclerView);
        itemRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Item> itemArrayList = ItemList.getItems();
        Log.d(TAG, "onCreate: "+itemArrayList.size());
        itemListAdapter=new ItemListAdapter(itemArrayList);
        itemRecyclerView.setAdapter(itemListAdapter);
    }


}