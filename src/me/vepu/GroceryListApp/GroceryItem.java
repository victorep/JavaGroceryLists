package me.vepu.GroceryListApp;

import me.vepu.GroceryListApp.InheritClasses.CRUDObject;
import me.vepu.GroceryListApp.interfaces.CRUDable;

import java.util.Date;

/**
 * Created by V on 15/09/2017.
 */
public class GroceryItem extends CRUDObject implements CRUDable {
    private int id;
    private String name;
    private boolean bought;
    private String productCategory;
    private Date dateAdded;
    private Date dateBought;
    private User addedByUser;

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public GroceryItem() {

    }

    public GroceryItem(int id) {

        setId(id);
        load();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
