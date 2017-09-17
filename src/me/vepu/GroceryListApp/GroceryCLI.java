package me.vepu.GroceryListApp;

import me.vepu.GroceryListApp.GroceryList.GroceryItem;
import me.vepu.GroceryListApp.GroceryList.GroceryList;
import me.vepu.cmdTools.CmdInput;
import me.vepu.cmdTools.CmdMenu;
import me.vepu.cmdTools.CmdOutput;


import java.util.ArrayList;

/**
 * Created by V on 15/09/2017.
 */
public class GroceryCLI {

    private ArrayList<GroceryList> groceryLists = new ArrayList<>();


    public void mainMenu(){

        CmdMenu menu = new CmdMenu("Grocery List");
        menu.addItem(menu,"quit","Exit");
        menu.addItem(this,"printLists","Print existing lists");
        menu.addItem(this,"selectList","Select list");
        menu.addItem(this,"addList","Add new list");

        GroceryList groceryList = new GroceryList();
        groceryList.setName("pentru casa");
        GroceryItem groceryItem = new GroceryItem();
        groceryItem.setName("Varza");
        groceryList.addItem(groceryItem);
        this.addList(groceryList);

        menu.enterMenu();
    }

    public void printLists(){

        CmdOutput.printText("==== Grocery Lists ====");

        for (int i=0;i<groceryLists.size();i++){
            CmdOutput.printText(i + ". " + groceryLists.get(i).getName());
        }

        CmdOutput.printText("========= END =========");


    }

    public void selectList(){

        selectGroceryList(CmdInput.readInt("Select list","Enter list ID:"));
    }

    public void addList(){
        String newListName = CmdInput.readString("Add list","Enter new list name: ");
        GroceryList newList = new GroceryList();
        newList.setName(newListName);
        addList(newList);
        CmdOutput.printText("Add list", "> Added list : " + newList.getName());
    }

    public void addList(GroceryList list){
        groceryLists.add(list);
    }

    private void selectGroceryList(int id){

        GroceryList groceryList = groceryLists.get(id);

        CmdMenu menu = new CmdMenu(groceryList.getName());
        menu.addItem(menu,"quit","Exit");
        menu.addItem(groceryList,"printListItems","List items");
        menu.addItem(groceryList,"addListItem","Add new iem");

        CmdOutput.printText("Loaded list [" + groceryList.getName()+"]");

        menu.enterMenu();

    }
}
