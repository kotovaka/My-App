import app.Helper;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        Helper.printSquare(number);

        double radius = 3.5;
        double height = 10.0;
        double volume = Helper.cylinderVolume(radius, height);
        System.out.println("Об'єм циліндра з радіусом " + radius
                + " і висотою " + height + " дорівнює " + volume + ".");

        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Масив чисел: " + Arrays.toString(numbers));
        System.out.println("Сума всіх елементів масиву дорівнює "
                + Helper.arraySum(numbers) + ".");

        scanner.nextLine();
        System.out.print("Введіть рядок: ");
        String line = scanner.nextLine();
        System.out.println("Рядок в зворотньому порядку: " + Helper.reverseString(line));

        System.out.print("Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        System.out.println("Результат " + a + "^" + b + " дорівнює "
                + Helper.power(a, b) + ".");

        System.out.print("Введіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть текстовий рядок: ");
        String text = scanner.nextLine();
        Helper.printTextNTimes(n, text);

        scanner.close();
    }
}