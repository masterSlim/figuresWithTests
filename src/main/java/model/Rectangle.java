package model;

public class Rectangle extends Parallelogramm{


    public Rectangle(double firstSide, double secondSide) {
        super(firstSide, secondSide);
        name = "прямоугольник";
    }

    @Override
    public double getArea() {
        return firstSide + secondSide;
    }
}