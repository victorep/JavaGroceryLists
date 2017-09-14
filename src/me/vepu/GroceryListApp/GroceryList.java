package me.vepu.GroceryListApp;

import me.vepu.GroceryListApp.InheritClasses.CRUDObject;

import java.util.LinkedList;

/**
 * Created by V on 15/09/2017.
 */
public class GroceryList extends CRUDObject {



    private String name;
    private User createdByUser;

    private User assignedUser;

    private LinkedList<GroceryItem> items = new LinkedList<>();

    public void addItem(GroceryItem item){
        items.add(item);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LinkedList<GroceryItem> getItems() {
        return items;
    }
}
