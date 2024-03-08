package com.mycompany.app.Week3.code_1.Arithmetic;

public class Plus extends Binop {
    public Plus(Node l, Node r){
        super(l, r);
    }

    public double eval(){
        return lChild.eval() + rChild.eval();
        //protected Node can
        //accessed by subclass
    }
}
