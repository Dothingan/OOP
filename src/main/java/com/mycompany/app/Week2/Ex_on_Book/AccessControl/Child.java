package com.mycompany.app.Week2.Ex_on_Book.AccessControl;

public class Child extends Parent{
    public void child(){
        parent();
        System.out.println("La con");
    }

    public void bite(){
        System.out.println("Ba-ka-");
    }

    protected void mama(){
        System.out.println("watashihamamadesu");
    }
}