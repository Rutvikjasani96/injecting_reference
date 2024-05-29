package com.injecting_collection;

public class B {
    private int y;

//    Getters
    public int getY() {
        return y;
    }
//    Setters
    public void setY(int y) {
        this.y = y;
    }
//    Constructor
    public B(int y) {
        this.y = y;
    }

//    toString

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                '}';
    }

    public B() {
    }
}
