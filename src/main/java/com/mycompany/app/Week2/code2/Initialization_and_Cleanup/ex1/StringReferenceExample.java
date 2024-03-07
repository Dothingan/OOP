package com.mycompany.app.Week2.code2.Initialization_and_Cleanup.ex1;
public class StringReferenceExample {
    private String uninitializedString;

    public StringReferenceExample() {
   
    }

    public void demonstrateInitialization() {
        System.out.println("Uninitialized String reference: " + uninitializedString);
    }

    public static void main(String[] args) {
        StringReferenceExample example = new StringReferenceExample();
        example.demonstrateInitialization();
    }
}
