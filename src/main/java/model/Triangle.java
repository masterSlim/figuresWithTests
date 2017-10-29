package model;

public class Triangle extends Figure{

    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.name = "треугольник";
    }
    @Override
    public double getPerimeter() {
        return firstSide+secondSide+thirdSide;
    }

    @Override
    public double getArea() {
        double p = (firstSide+secondSide+thirdSide)/2;
        return Math.sqrt(p*(p-firstSide)*(p-secondSide)*(p-thirdSide));
    }

    @Override
    public String getInfo() {
        return name+" со сторонами " + firstSide + ", " + secondSide + ", " + thirdSide +".";
    }
}
