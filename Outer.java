package com.learn;

public class Outer {
    void display(){System.out.println("OuterDisplay");}
    public class Inner{
        void display() {System.out.println("InnerDisplay");}
    }
}
