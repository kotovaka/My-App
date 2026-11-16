package app;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Triangle(6, 4),
                new Square(3)
        };

        printTotalArea(shapes);
    }

    public static void printTotalArea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }
        System.out.printf("Сумарна площа всіх фігур: %.2f%n", total);
    }
}