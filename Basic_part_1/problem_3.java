package Basic_part_1;

import java.util.Scanner;

/*Write a Java program that takes a number as input and prints its multiplication table up to 10. */
public class problem_3 {
    public static void main(String[] args) {
        Scanner ab = new scanner(System.in);
     
    int result = 0;
     System.out.println("Enter a number: ");
     for (int i =1;i<=10; i++){
         result = (ab * i);
     }
     

    }
    ab.close();
    
    
}
