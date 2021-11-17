// Assignment of (16/11/2021) class taken by Rakhi Ma'am !

import java.util.Scanner;
 public class Assignment_16_11_2021 {
    public static void main(String[] args) {

// Que. No - 1 :- WAP to calculate no. of digits in a number entered by user

        Scanner sc = new Scanner(System.in);
        System.out.println("Que. No - 1 :-");
        System.out.println("Enter a Number :- ");
        long number = sc.nextLong();
        long count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        System.out.println("The digits in entered Number is :- " + count);
        System.out.println();

 /* Que. No - 2 :- Apply do while loop to calculate factorial of a given number such that, program asks to user
 if he wants to continue, if yes, program should run again */

        System.out.println(" Que. No - 2 :-");
        char ch;
        do {
            System.out.println("Enter a number which you wants to calculate the factorial :- ");
            int x = sc.nextInt();
            int fact = 1;
            for (int i=x;i>=1;i--){
                fact = fact*i;
            }
            System.out.println("The factorial of a given number is :- "+fact);
            System.out.println("Do you want to continue ?(y/n) ");
             ch = sc.next().charAt(0);
        }while (ch == 'y');
        {
        }
        System.out.println();

        // Function Calling.......
        System.out.println("Que. No - 3 :-");
        System.out.println("Enter the Number Which you want to check it's even or odd :- ");
        int num = sc.nextInt();
        checkEvenOdd(num);
    }

// Que. No - 3 :- WAP to create Function that check if no. is odd or even. Call this function from main method

    public static int checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("The entered number is Even");
        }
        else {
            System.out.println("The entered number is odd");
        }
        return num;
    }


    }
