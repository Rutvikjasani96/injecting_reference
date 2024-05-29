package com.injecting_collection;

public class A {
    private int x;
    private B ob;

//    Getters
    public int getX() {
        return x;
    }

    public B getOb() {
        return ob;
    }

//    Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }

//    Constructor
    public A(int x, B ob) {
        this.x = x;
        this.ob = ob;
    }

    public A() {
    }

    //    toString

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", ob=" + ob +
                '}';
    }
}
