package Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter First Number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter Third Number: ");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3){
            System.out.println("All number are equals.");
        }
        else {
            int largest = num1;

            if (num2 > largest){
                largest = num2;
            }

            if (num3 > largest){
                largest = num3;
            }

            System.out.println("The largest number is: " + largest);

        }

        scanner.close();
    }  
}