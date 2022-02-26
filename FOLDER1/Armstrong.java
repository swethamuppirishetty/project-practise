/*Write a java Program to Check Armstrong Number between Two Integers.*/
package FOLDER1;

public class Armstrong {

    public static void main(String[] args) {

        findArmstrong(100, 500);

    }

    public static void findArmstrong(int start, int end) {

        for (int i = start; i <= end; i++) {
            int num = i;
            int arm=0;
            

            while (num > 0) {
                int rem = num % 10;
                arm = arm+ (int)Math.pow(rem,3);
                num = num / 10;

            }

            
            if (i == arm) {
                System.out.print(arm + " ");
            }
        }

    }
}
