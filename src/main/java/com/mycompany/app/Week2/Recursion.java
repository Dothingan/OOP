package com.mycompany.app.Week2;

public class Recursion {
    public int num;

    Recursion(){};

    //nhan 1 so nguyen
    public Recursion(int number){};

    //tra ve ket qua de quy
    public int Recursion(int number){
        this.num = number;
        if(this.num <= 1){
            return 1;
        }
        else
            return this.num*Recursion(this.num - 1);
    }
}
