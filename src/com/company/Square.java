package com.company;

public class Square implements Area {
    private int a;
    public Square(int a) {
        this.a = a;
    }
    @Override
    public void area() {
        System.out.println("Площадь квадрата " + a * a);
    }
}
