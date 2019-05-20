package com.example.accounts;

import android.database.Cursor;

import com.example.accounts.Item;

import java.util.Map;

public class CatalogOperator {

    //Constructor
    public CatalogOperator(){}

    public void removeItem(/*item id*/){}
    public void addItem(/*Item instance*/){}
    public void replaceItem(/*initial item id, new item id*/){}
    public void scanForChanges(){}
    public String generateReport(){return null;}
    public Cursor searchItem(/*search statement*/){return null;}
    public void browseCatalog(){}
    public String itemInfo(/*item id*/){return null;}
    public void likeItem(/*item id*/){}
    public void recommendItem(/*item id*/){}
    public void rateItem(/*item id*/){}
    public void returnItem(/*item id*/){}
    public void pickItem(/*item id*/){}
    public void proposeItem(){}
    public Item getItem(){return null;}
    public Map getItemExtras(/*item id as argument*/){return null;}
}
