package model;

public class Rhombus extends Parallelogramm {
    public Rhombus(double firstSide) {
        super(firstSide, firstSide);
        name = "ромб";
        }

    @Override
    public double getPerimeter() {
        return firstSide * 4;
    }

    @Override
    public String getInfo() {
        return name +" со стороной "+ firstSide;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}
