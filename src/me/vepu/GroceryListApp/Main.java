package me.vepu.GroceryListApp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static ArrayList<GroceryList> groceryLists = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here
        // Set instructions for grocery lists menu
        Instructions listInstructions = new Instructions("Grocery Lists");
        listInstructions.addItem("Exit");
        listInstructions.addItem("Print existing lists");
        listInstructions.addItem("Select list");
        listInstructions.addItem("Add new list");




        GroceryList groceryList = new GroceryList();
        groceryList.setName("pentru casa");
        GroceryItem groceryItem = new GroceryItem();
        groceryItem.setName("Varza");

        groceryList.addItem(groceryItem);

        groceryLists.add(groceryList);

        //Begin of main menu
        int option = -1;

        while (option!=0) {
            listInstructions.printList();
            System.out.print(">"); option= scan.nextInt();

            switch(option){
                case 0:
                    break;
                case 1:
                    for (int i=0;i<groceryLists.size();i++){
                        System.out.println(i + ". " + groceryLists.get(i).getName());
                    }
                    break;
                case 2:
                    System.out.print("Enter list id >");
                    selectGroceryList(scan.nextInt()-1);
                    break;
                case 3:
                    System.out.print("Enter new list name: ");
                    String newListName = scan.next();
                    scan.nextLine();
                    GroceryList newList = new GroceryList();
                    newList.setName(newListName);
                    groceryLists.add(newList);
                    System.out.print(groceryList.getName()+ "> Added list : " + newList.getName());
                    break;
                default:
                    System.out.println("Option does not exist");
                    break;
            }
        }
    }

    private static Scanner scan = new Scanner(System.in);

    private static void selectGroceryList(int id){
        GroceryList groceryList = groceryLists.get(id);
        Instructions listInstructions = new Instructions("List " + groceryList.getName());
        listInstructions.addItem("Back");
        listInstructions.addItem("List items");
        listInstructions.addItem("Add new iem");
        System.out.println("Loaded list [" + groceryList.getName()+"]");

        int option=-1;
        while (option!=0) {
            listInstructions.printList();
            System.out.print(groceryList.getName()+ ">"); option= scan.nextInt();

            switch(option){
                case 0:
                    break;
                case 1:
                    LinkedList<GroceryItem> items = groceryList.getItems();
                    for (int i=0;i<items.size();i++){
                        System.out.println(i + ". " + items.get(i).getName());
                    }
                    break;
                case 2:
                    System.out.print(groceryList.getName()+ "Enter new item name> ");
                    String newItemName = scan.next();
                    scan.nextLine();
                    GroceryItem newItem = new GroceryItem();
                    newItem.setName(newItemName);
                    groceryList.addItem(newItem);
                    System.out.print(groceryList.getName()+ "> Added item : " + newItem.getName());
                    break;
                default:
                    System.out.println("Option does not exist");
                    break;
            }
        }

    }
}
