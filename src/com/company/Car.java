package com.company;

public class Car implements PARAM{

    @Override
    public void move() {
        System.out.println("Машина движется вперед");
    }

    @Override
    public void stop() {
        System.out.println("Машина останавливается");
    }

    @Override
    public void open() {
        System.out.println("Открывает двери");
    }
    int speed;
    String name;

    public Car(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void showinfo(){
        System.out.println("Name: " + name + " " + "Speed: " + speed);
    }
}
