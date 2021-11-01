/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ucf.assignments;

import java.io.IOException;
import java.util.ArrayList;

class ListManager {
    private ArrayList<TodoList> myTodoLists;

    //All functions are either empty or set to a temporary literal. Function is intuitive from respective title
    ArrayList<TodoList> getTodoLists() { return null; }
    TodoList getTodoList(String title) { return null; }
    TodoList getTodoList(int index) { return null; }
    void addTodoList(TodoList T) {}
    void addTodoList(String title) {}
    void addTodoList(String title, ArrayList<Item> inputItems) {}
    void removeTodoList(String title) {}
    void removeTodoLIst(int index) {}
    void exportTodoList(String filename, String title) throws IOException {}
    void exportTodoList(String filename, int index) throws IOException {}
    void exportAllTodoLists(String filename) throws IOException {}
    void importTodoList(String filename) throws IOException {}
    void importAlTodoLists(String filename) throws IOException {}
}