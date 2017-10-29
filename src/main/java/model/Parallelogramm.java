package model;

public class Parallelogramm extends model.Quadrilateral {

    public Parallelogramm(double firstSide, double secondSide) {
        super(firstSide, secondSide, firstSide, secondSide);
        name = "параллелограмм";
    }

    @Override
    public double getPerimeter() {
        return (firstSide + secondSide) * 2;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String getInfo() {
        return name + " " + "со сторонами " + firstSide + secondSide;
    }
}
