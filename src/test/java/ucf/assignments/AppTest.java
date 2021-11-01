/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void Test_6() {
        //A user shall be able to add a new todo list
        //This will be done by creating a ListManager and using the addTodoList function
    }

    @Test
    public void Test_7() {
        //A user shall be able to remove an existing todo list
        //This will be done by creating a ListManager and using the removeTodoList function
    }

    @Test
    public void Test_8() {
        //A user shall be able to edit the title of an existing todo list
        //This will be done by creating a todoList and using the setTitle function
    }

    @Test
    public void Test_9() {
        //A user shall be able to add a new item to an existing todo list
        //This will be done by creating a todoList and using the addItem function
    }

    @Test
    public void Test_10() {
        //A user shall be able to remove an item from an existing todo list
        //This will be done by creating a todoList and using the removeItem function
    }

    @Test
    public void Test_11() {
        //A user shall be able to edit the description of an item within an existing todo list
        //This will be done by creating a todoList and using the getItem function, and then the setDescription function
    }

    @Test
    public void Test_12() {
        //A user shall be able to edit the due date of an item within an existing todo list
        //This will be done by creating a todoList and using the getItem function, and then the setDueDate function
    }

    @Test
    public void Test_13() {
        //A user shall be able to mark an item in a todo list as complete
        //This will be done by creating a todoList and using the getItem function, and then the setCompletion function
    }

    @Test
    public void Test_14() {
        //A user shall be able to display all of the existing items in a todo list
        //This function will be done by checking if todoLists export valid inputs
    }

    @Test
    public void Test_15() {
        //A user shall be able to display only the incomplete items in a todo list
        //This function will be done by checking if todoLists export valid inputs
    }

    @Test
    public void Test_16() {
        //A user shall be able to display only the completed items in a todo list
        //This function will be done by checking if todoLists export valid inputs
    }

    @Test
    public void Test_17() {
        //A user shall be able to save all of the items in a single todo list to external storage
        //This will be done by creating a ListManager and using the exportTodoList function
    }

    @Test
    public void Test_18() {
        //A user shall be able to save all of the items across all of the todo lists to external storage
        //This will be done by creating a ListManager and using the exportTodoLists function
    }

    @Test
    public void Test_19() {
        //A user shall be able to load a single todo list that was previously saved to external storage
        //This will be done by creating a ListManager and using the importTodoList function
    }

    @Test
    public void Test_20() {
        //A user shall be able to load multiple todo lists that were previous saved to external storage
        //This will be done by creating a ListManager and using the importTodoLists function
    }
}