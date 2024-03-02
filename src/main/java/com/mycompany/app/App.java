/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

//import the whole class belong to the package of com.mycompay.app
import com.mycompany.app.*;

//import built-in class
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

import javax.naming.Name;
import java.lang.Math;

//import list
//import com.mycompany.app.Week2.Book;
import com.mycompany.app.Week2.*;
// import com.mycompany.app.Week2.Book;
// import Recursion;
import com.mycompany.app.Week2.Ex_on_Book.AccessControl.debug.debug;
import static com.mycompany.app.Week2.Ex_on_Book.AccessControl.debug.debug.Debug;
import static com.mycompany.app.Week2.Ex_on_Book.AccessControl.debugoff.debug.Debug;





public class App {
    public static void main(String[] args) {
        
        //test book
        Book myObj = new Book("a", "b", 2);
        System.out.println(myObj.title);

        //test time
        Time myTime = new Time();
        int a = 13;
        int b = 21;
        int c = 28;
        myTime.setTime(a, b, c);
        myTime.stringToScreen();

        //test recursion
        int num = 3;
        Recursion myFactorial = new Recursion(num);
        myFactorial.Recursion(num);
        System.out.println("test recursion: 1x2.."+"x"+num+"="+myFactorial.Recursion(num));

        //test number name collection
        NameNumber [] nn = new NameNumber[2];
        nn[0] = new NameNumber("John Doe", "0919191919");
        nn[1] = new NameNumber("John Doe", "919");
        String lastName = nn[0].getLastName();
        String number = nn[0].getTelNumber();

        NNCollection nnC = new NNCollection();
        nnC.insert(nn[0]);
        nnC.insert(nn[1]);
        String numFind = nnC.findNumber(lastName);
        System.out.println(numFind);

        //ex3
        debug.Debug("Baka");

        //ex4
        Parent p1 = new Parent();
        p1.parent();
        p1.bite();
        Child c1 = new Child();
        c1.child();
    //    c1.bite();  //khong the truy cap tu ngoai vi protected
        
        //ex5
        MyClass obj = new MyClass();
        System.out.println("truong public: " + obj.a1);
        obj.publicMethod();
    //truy cap loi
        // System.out.println("Truong private: " + obj.a2);
        // obj.privateMethod();
        // System.out.println("Truong protected: " + obj.a3);
        // obj.protectedMethod();
        // System.out.println("truong package: " + obj.a4);
        // obj.packageMethod();



    }
}
