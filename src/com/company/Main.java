package com.company;

public class Main {

    public static void main(String[] args) {
    Car car1 = new Car(45,"lada");
        System.out.println("Машина 1: ");
    car1.stop();
    Car car2= new Car(35,"opel");
        System.out.println("Машина 2: ");
        car2.move();
    Car car3 = new Car(60,"mytsubisy");
        System.out.println("Машина 3: ");
        car3.open();
        car1.showinfo();
        car2.showinfo();
        car3.showinfo();
    }
}
