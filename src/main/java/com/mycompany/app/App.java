/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

import com.mycompany.app.Week2.code1.*;
import com.mycompany.app.Week2.code2.AccessControl.*;
import com.mycompany.app.Week2.code2.AccessControl.ex3.debugoff.debug;
import com.mycompany.app.Week2.code2.AccessControl.ex5.*;
import com.mycompany.app.Week2.code3.Class.*;
import com.mycompany.app.Week2.code3.JavaMethods.*;





public class App {

//WEEK2

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
        int num = 10;
        Recursion myFactorial = new Recursion(num);
        myFactorial.recursion(num);
        System.out.println("test recursion: 1x2.."+"x"+num+"="+myFactorial.recursion(num));

        //test number name collection
        NameNumber [] nn = new NameNumber[2];
        nn[0] = new NameNumber("John Doe", "0919191919");
        nn[1] = new NameNumber("John Doe", "919");
        String lastName = nn[0].getLastName();
        // String number = nn[0].getTelNumber();

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
        c1.bite();  
        //c1.mama();  //khong the truy cap tu ngoai vi protected
        
        //ex5
        MyClass obj = new MyClass();
        System.out.println("truong public: " + obj.publicField);
        obj.publicMethod();
    //truy cap loi
        // System.out.println("Truong private: " + obj.privateField);
        // obj.privateMethod();
        // System.out.println("Truong protected: " + obj.protectedField);
        // obj.protectedMethod();
        // System.out.println("truong package: " + obj.packageAccessField);
        // obj.packageAccessMethod();

        //test myMethod
        myMethod m1 = new myMethod();
        m1.mymethod();

        //test Parameters
        Parameters p2 = new Parameters();
        p2.parameter("John");

        //test overloading
        overloading o1 = new overloading();
        int myNum1 = o1.plusMethod(8, 5);
        double myNum2 = o1.plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        //test checkAge
        checkAge c2 = new checkAge();
        c2.check(20);

        //test class
        Attributes Obj = new Attributes();
        System.out.println("Name: " + Obj.fname + " "+ Obj.lname);
        System.out.println("Number favorite is: " + Obj.NumFavorite);

        ClassMethods myCar = new ClassMethods();
        myCar.fullThrottle();
        myCar.speed(1000);

        Constructors myCar1 = new Constructors(2004, "Bugati");
        System.out.println(myCar1.modelYear + " " + myCar1.modelName);

        
    }
}
