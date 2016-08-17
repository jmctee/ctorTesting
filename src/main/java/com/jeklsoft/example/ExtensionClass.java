package com.jeklsoft.example;

public class ExtensionClass extends BaseClass {

    public ExtensionClass() {
        System.out.println("ExtensionClass ctor");
    }

//    public ExtensionClass(int number) {
//        super(number);
//        System.out.println("ExtensionClass ctor2");
//    }
//
//    public ExtensionClass(String string) {
//        super(Integer.parseInt(string));
//        System.out.println("ExtensionClass ctor3");
//    }

    public static void main(String[] args) {
        ExtensionClass clazz = new ExtensionClass();

//        ExtensionClass clazz2 = new ExtensionClass(3);
//
//        ExtensionClass clazz3 = new ExtensionClass("6");
    }
}
