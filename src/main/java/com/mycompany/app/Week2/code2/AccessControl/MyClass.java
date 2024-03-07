package com.mycompany.app.Week2.code2.AccessControl;

public class MyClass{
    public int a1 = 3;
    // private int a2 = 8;
    protected int a3 = 38;
    int a4 = 10;

    public void publicMethod(){
        System.out.println("Day la mot phuong thuc public");
    }

    // private void privateMethod(){
    //     System.out.println("Day la mot phuong thuc private");
    // }

    protected void protectedMethod(){
        System.out.println("Day la mot phuong thuc protected");
    }

    void packageMethod(){
        System.out.println("Day la mot phuong thuc package-access");
    }
}