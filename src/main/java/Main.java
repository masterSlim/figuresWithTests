import model.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Figure> figureList = new ArrayList<>();

        Quadrilateral quadrilateral = new Quadrilateral(5, 10, 15, 20);
        figureList.add(quadrilateral);
        quadrilateral.getArea();

        Parallelogramm parallelogramm = new Parallelogramm(10, 5);
        figureList.add(parallelogramm);

        Rectangle rectangle = new Rectangle(10, 5);
        figureList.add(rectangle);

        Rhombus rhombus = new Rhombus(5);
        figureList.add(rhombus);

        Square square = new Square(5);
        figureList.add(square);


        /*for(int i = 0; i < figureList.size(); i++){
            double area = figureList.get(i).getArea();
            if (area>0)
                System.out.println("площадь равна " + area);
            System.out.println(figureList.get(i).getInfo());
            System.out.println("Периметр равен " + figureList.get(i).getPerimeter());
            System.out.println("площадь равна " + figureList.get(i).getArea());
        }*/
        for (Figure figure: figureList){
           System.out.println(figure.getInfo());
           System.out.println("Периметр равен " + figure.getPerimeter());
            try {
                System.out.println("площадь равна " + figure.getArea());
           }catch (NotImplementedException e){
                System.out.println("площадь не может быть вычислена");
            }

         /*  double area = figure.getArea();
            if (area>0)
                System.out.println("площадь равна " + area);

        }*/

        System.out.println("Периметр равен " + quadrilateral.getPerimeter());
        System.out.println("периметр равен " + rhombus.getPerimeter());
        System.out.println("площадь равна " + rhombus.getArea());
        System.out.println("периметр равен " + square.getPerimeter());
        System.out.println("площадь равна " + square.getArea());
        System.out.println(quadrilateral.getInfo());
        System.out.println(parallelogramm.getInfo());
        System.out.println(rectangle.getInfo());
}
}
}

