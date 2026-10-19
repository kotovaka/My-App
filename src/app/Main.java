
package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the income amount to calculate the tax amount:");

        Scanner sc = new Scanner(System.in);
        double incomeAmount = sc.nextDouble();

        double incomePercentage;

        if (incomeAmount >= 0 && incomeAmount <= 10000) {
            incomePercentage = 2.5;
        } else if (incomeAmount <= 25000) {
            incomePercentage = 4.3;
        } else {
            incomePercentage = 6.7;
        }

        double taxAmount = incomeAmount * incomePercentage / 100;

        System.out.printf(
                "The tax amount on the income is %.2f at a rate of %.1f%%%n",
                taxAmount, incomePercentage
        );
    }
}
