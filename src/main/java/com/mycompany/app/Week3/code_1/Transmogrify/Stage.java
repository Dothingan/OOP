package com.mycompany.app.Week3.code_1.Transmogrify;

public class Stage {
    Actor a = new HappyActor();
    public void change() {
        a = new SadActor();
    }
    public void go(){
        a.act();
    }
}
