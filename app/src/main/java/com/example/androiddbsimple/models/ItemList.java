package com.example.androiddbsimple.models;

import java.util.ArrayList;

public class ItemList {


    public static ArrayList<Item> getItems() {

        ArrayList<Item> list = new ArrayList<>();

        list.add(new Item("Item 1"));
        list.add(new Item("Item 2"));
        list.add(new Item("Item 3"));
        list.add(new Item("Item 4"));

        return list;
    }
}
