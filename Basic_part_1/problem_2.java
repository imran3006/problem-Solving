package Basic_part_1;

import java.util.Scanner;

/*Write a Java program that takes two numbers as input and displays the product of two numbers. */
public class problem_2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        double result  = (num1 * num2);
        System.out.println(result);

        scanner.close();

       
 }
}
