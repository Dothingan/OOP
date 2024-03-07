package com.mycompany.app.Week2.code1;

public class NameNumber {
    private String lastName;
    private String telNumber;
    public NameNumber(String name, String num){
        this.lastName = name;
        this.telNumber = num;
    }
    public String getLastName(){
        return lastName;
    }
    public String getTelNumber(){
        return telNumber;
    }
}
