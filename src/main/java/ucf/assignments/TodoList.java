/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ucf.assignments;

import java.util.ArrayList;

class TodoList {
    private ArrayList<Item> myItems;
    private String myTitle;

    TodoList(String t) {
        //TODO
    }

    TodoList(String t, ArrayList<Item> inputItems) {
        //TODO
    }

    //All functions are either empty or set to a temporary literal. Function is intuitive from respective title
    String getTitle() { return "TODO"; }
    Item getItem(String desc) { return null; }
    Item getItem(int index) { return null; }
    void setTitle() {}

    void addItem(Item i) {}
    void addItem(String desc, String date) {}
    Item removeItem(int i) { return null; }
    Item removeItem(String desc) { return null; }
    void replaceList(ArrayList<Item> myItems) {}
}