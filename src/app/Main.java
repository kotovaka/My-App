
package app;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num = 0;
        int sum = 0;


        for(int i=1; i<=6; i++){
            num = i;
            sum += i;
            System.out.println(num + ") Num is " + num + ", sum is " + sum );
        }
        System.out.println("------------------------\nSum of numbers is " + sum);


    }
}

