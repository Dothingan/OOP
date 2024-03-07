package com.mycompany.app.Week2.Ex_on_Book.AccessControl.ex1;
public class MyClass {
    private String message;

    public MyClass(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println("Message from MyClass: " + message);
    }
}

