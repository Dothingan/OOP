package com.mycompany.app.Week2;

public class Recursion {
    public int num;

    Recursion(){};

    //nhan 1 so nguyen
    public Recursion(int number){
        this.num = number;
    };


    //tra ve ket qua de quy
    public int recursion(int number){
        this.num = number;
        if(this.num <= 1){
            return 1;
        }
        else
            return this.num*recursion(this.num - 1);
    }
}
