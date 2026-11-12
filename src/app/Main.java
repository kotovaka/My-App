package app;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Іваненко Іван Іванович", "Розробник",
                "ivanenko@example.com", "+380501234567", 30);
        employee.printInfo();

        System.out.println();

        Car car = new Car();
        car.start();

    }
}