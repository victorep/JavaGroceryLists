package me.vepu.GroceryListApp.interfaces;

/**
 * Created by V on 15/09/2017.
 */
public interface CRUDable {

    int getId();

    void setId(int id);

    void save();

    void load();

    void rename(String newName);

    void remove();




}
