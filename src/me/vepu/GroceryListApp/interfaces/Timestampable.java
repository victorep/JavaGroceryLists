package me.vepu.GroceryListApp.interfaces;

import java.util.Date;

/**
 * Created by V on 15/09/2017.
 */
public interface Timestampable {
    Date getDateCreated();
    Date getDateModified();
}
