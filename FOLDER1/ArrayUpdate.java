/*Write a Java program to update specific array element by given element*/ 
package FOLDER1;

import java.util.Scanner;

public class ArrayUpdate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 10, 20, 30, 40, 50 };

        System.out.println("enter index number..where u want to update a value::");
        int ind_num = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arr[ind_num]) {
                System.out.println("enter a value : ");

                arr[i] = sc.nextInt();

            }
        }

        for (int element : arr) {
            System.out.println("-------");
            System.out.println(element);

        }
    }

}
