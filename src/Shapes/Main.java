package Shapes;

import Shapes.Shapes;

public class Main {
    public static void main(String[] args) {

        Shapes triangle = new Triangle(3, 5);
        triangle.findArea();
        System.out.println("Triangle  ");

        Shapes rectangle = new Rectangle(4,2);
        rectangle.findArea();
        System.out.println("Rectangle  ");


        Shapes circle = new Rectangle(8,6);
        circle.findArea();
        System.out.println("Rectangle  ");

        Shapes square = new Square(6,6);
        square.findArea();
        System.out.println("Square  ");








    }

}