package com.example.lulu920;

public class zi extends fu{
    public static String s = "static_childen";
    public String m = "children";

    public static void baseTest(){
        System.out.println("children  static"+s);
    }

    public static void main(String[] args) {
        zi c = new zi();
        fu  b =  c;
        System.out.println(b.m);
        System.out.println(b.s);
        b.baseTest();
        System.out.println(c.m);
        System.out.println(c.s);
        c.baseTest();
    }
}
