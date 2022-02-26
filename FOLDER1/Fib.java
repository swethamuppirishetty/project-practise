/*Write a java Program to Find Sum of Fibonacci Series Numbers of First n even indexes.*/
package FOLDER1;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {

        int a = 0, b = 1;
        int sum = 1;

        for (int i = 3; i <= 10; i++) {
            int c = a + b;
            if (i % 2 == 0) {
                sum = sum + c;

            }
            a = b;
            b = c;

        }
        System.out.println(sum);

    }

}
