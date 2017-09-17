package me.vepu.GroceryListApp;

import me.vepu.GroceryListApp.GroceryList.GroceryList;
import java.util.ArrayList;


public class Main {
    private static ArrayList<GroceryList> groceryLists = new ArrayList<>();

    public static void main(String[] args) {

        GroceryCLI groceryCLI = new GroceryCLI();

        groceryCLI.mainMenu();

    }


}
