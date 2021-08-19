package com.example.androiddbsimple.DBmanager;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ItemDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertItem(Item item);

    @Query("Select * from Items order by name ASC")
    LiveData<List<Item>> getWords();

}
