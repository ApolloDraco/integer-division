/* 
 *  Description: A Java Program utilizing a scanner to determine whether an integer is divisible by 2 and/or 3
*/

import java.util.Scanner;

public class IntegerDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by both 2 and 3.");
        } else if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + " is divisible by either 2 or 3.");
        } else {
            System.out.println(number + " is not divisible by either 2 or 3.");
        }
    }
}
