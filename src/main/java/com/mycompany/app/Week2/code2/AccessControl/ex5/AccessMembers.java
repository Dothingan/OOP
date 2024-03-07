package com.mycompany.app.Week2.code2.AccessControl.ex5;
public class AccessMembers {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        System.out.println("Public Field: " + myObject.publicField);
        myObject.publicMethod();

        System.out.println("Package-Access Field: " + myObject.packageAccessField);
        myObject.packageAccessMethod();
    }
}

