package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    private Triangle triangle;

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle(3, 5, 4);
    }

    @Test
    public void getPerimeter() throws Exception {
        if (triangle.getPerimeter() == 12) {
            System.out.println("Периметр рассчитывается верно");
        } else {
            System.out.println("Периметр рассчитывается неверно");
        }
    }

    @Test
    public void getArea() throws Exception {
        if (triangle.getArea() == 6) {
            System.out.println("Площадь рассчитывается верно");
        } else {
            System.out.println("Площадь рассчитывается неверно");
        }
    }

    @Test
    public void getInfo() throws Exception {
        if (triangle.getInfo().equals("треугольник со сторонами ")) {
            System.out.println("Имя выводится верно");
        } else {
            System.out.println("Имя выводится неверно");
        }

    }

}