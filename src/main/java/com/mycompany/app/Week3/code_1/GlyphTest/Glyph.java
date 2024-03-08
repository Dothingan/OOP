package com.mycompany.app.Week3.code_1.GlyphTest;

abstract class Glyph {
    abstract void draw();
    Glyph(){    
        System.out.println("Glyph() before draw");
        draw();
        System.out.println("Glyph() after draw");
    }
}
