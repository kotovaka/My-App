package app;

public class Helper {

    public static void printSquare(int number) {
        System.out.println("Квадрат числа " + number + " дорівнює " + (number * number) + ".");
    }

    public static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static long power(int a, int b) {
        long result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public static void printTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}