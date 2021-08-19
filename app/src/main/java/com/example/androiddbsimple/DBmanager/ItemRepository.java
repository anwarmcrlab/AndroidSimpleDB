package com.example.androiddbsimple.DBmanager;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class ItemRepository {
    private ItemDao itemDao;
    private LiveData<List<Item>> itemList;

    public ItemRepository(Application application){

    }


}
