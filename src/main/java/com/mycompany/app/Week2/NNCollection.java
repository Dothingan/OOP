package com.mycompany.app.Week2;

public class NNCollection {
    //khoi tao mang
    private NameNumber[] nnArray = new NameNumber[100];
    private int free;
    
    //mang nnArray khong co phan tu nao
    public NNCollection(){
        free = 0;
    }
    
    //chen n
    public void insert(NameNumber n){
        int index = 0;
        for(int i = free++; (i != 0) && (nnArray[i-1].getLastName().compareTo(n.getLastName()) > 0); i--){
            nnArray[i] = nnArray[i-1];
            index = i;
        }
        nnArray[index] = n;
    }
    
    //tim sdt thong qua lastname
    public String findNumber(String lName){
        for(int i = 0; i!= free; i++){
            if(nnArray[i].getLastName().equals(lName))
                return nnArray[i].getTelNumber();
        }
        return new String("Name not found");
    }
}
