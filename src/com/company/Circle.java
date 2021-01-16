package com.company;

    public class Circle implements Area{
        private int radius;
        public Circle(int radius) {
            this.radius = radius;
        }
        @Override
        public void area() {
            System.out.println("Площадь круга "+Math.PI*Math.pow(radius, 2));
        }
}
