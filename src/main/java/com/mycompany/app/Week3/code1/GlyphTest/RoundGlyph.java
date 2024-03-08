package com.mycompany.app.Week3.code1.GlyphTest;

public class RoundGlyph extends Glyph{
    int radius = 1;
    public RoundGlyph(int r){
       this.radius = r; 
    }

    public void draw(){
        System.out.println("Round Glyph draw method " + this.radius);
    } 
    
}
