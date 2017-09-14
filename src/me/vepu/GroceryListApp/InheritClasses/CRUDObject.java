package me.vepu.GroceryListApp.InheritClasses;

import me.vepu.GroceryListApp.interfaces.CRUDable;
import me.vepu.GroceryListApp.interfaces.Timestampable;

import java.util.Date;

/**
 * Created by V on 15/09/2017.
 */
public class CRUDObject implements CRUDable,Timestampable {

    private int id;
    private Date dateCreated;
    private Date dateModified;

    //CRUD Methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void save() {

    }

    public void load(){

    }


    public void rename(String newName){

    }

    public void remove(){

    }

    //Timestamp methods
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }
}
