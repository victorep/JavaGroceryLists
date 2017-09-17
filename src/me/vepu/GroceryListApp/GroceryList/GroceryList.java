package me.vepu.GroceryListApp.GroceryList;

import me.vepu.GroceryListApp.InheritClasses.CRUDObject;
import me.vepu.GroceryListApp.User.User;
import me.vepu.cmdTools.CmdOutput;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * Created by V on 15/09/2017.
 */
public class GroceryList extends CRUDObject implements Serializable {

    private String name;

    private User createdByUser;
    private User assignedUser;

    private LinkedList<GroceryItem> items = new LinkedList<>();

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void addItem(GroceryItem item){

        items.add(item);

    }

    public LinkedList<GroceryItem> getItems() {

        return items;

    }

    public void printListItems(){

        CmdOutput.printText("==== Grocery List  ====");

        for (int i=0;i<getItems().size();i++){
            CmdOutput.printText(i + ". " + getItems().get(i).getName());
        }

        CmdOutput.printText("========= END =========");

    }
}
