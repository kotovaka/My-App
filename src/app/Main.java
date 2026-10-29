package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int[] arr = new int[15];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 101);
        }
        System.out.println("Початковий вигляд масиву: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int count = 1;

            while (i - count >= 0 && arr[i - count] > key) {
                arr[i - count + 1] = arr[i - count];
                count++;
            }
            arr[i - count + 1] = key;
        }

        System.out.println("Відсортований масив: " + Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int target = scanner.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("Індекс числа " + target + " у відсортованому масиві: " + index);
        } else {
            System.out.println("Числа " + target + " немає в масиві");
        }



    }
}