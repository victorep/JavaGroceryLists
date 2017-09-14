package me.vepu.GroceryListApp;

import java.util.ArrayList;

/**
 * Created by V on 15/09/2017.
 */
public class Instructions {
    private ArrayList<String> list = new ArrayList<>();
    private String moduleName;

    public Instructions(String moduleName) {
        setModuleName(moduleName);
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void addItem(String item) {
        list.add(item);
    }

    public void printList(){
        System.out.println("[" + moduleName + "]" + " Select option:");
        for (int i = 0; i< list.size(); i++){
            System.out.println((i) + ". " + list.get(i));
        }
    }

}
