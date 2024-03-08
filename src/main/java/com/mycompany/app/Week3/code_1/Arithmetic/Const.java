package com.mycompany.app.Week3.code_1.Arithmetic;

public class Const extends Node{
    private double value;
    public Const(double d){
        value = d;
    }
    public double eval(){
        return value;
    }
}
