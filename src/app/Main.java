
package app;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int[] arr = new int[20];
        Random random = new Random();
        for(int i = 0; i< arr.length; i++){
            arr[i] = random.nextInt(-100, 101);

        }
        System.out.println("Елементи масиву: " + Arrays.toString(arr));


        int negativeSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeSum = negativeSum + arr[i];
            }
        }

        System.out.println("Сума від'ємних чисел: " + negativeSum);

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount +=  1;
            } else {
                oddCount += 1;
            }
        }
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);

        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Найменший елемент: " + arr[minIndex] + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + arr[maxIndex] + " (з індексом " + maxIndex + ")");

        int negIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negIndex = i;
                break;
            }
        }

        if (negIndex == -1) {
            System.out.println("Від'ємних чисел у масиві немає");
        } else if (negIndex == arr.length - 1) {
            System.out.println("Після першого від'ємного числа - чисел немає");
        } else {
            double sum = 0;
            int count = 0;
            for (int i = negIndex + 1; i < arr.length; i++) {
                sum = sum + arr[i];
                count = count + 1;
            }
            double average = sum / count;
            System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f%n", average);
        }

    }
}

