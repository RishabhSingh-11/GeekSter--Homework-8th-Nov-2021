// Assignment of (18/11/2021) class taken by Rakhi Ma'am !

import java.util.Scanner;

public class Assignment_18_11_2021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Que. No : 1 :- WAP to find Greatest of two number using ternary operator.....
        System.out.println("Enter the 1st number :- ");
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd number :- ");
        int n2 = sc.nextInt();
        String str = n1 > n2 ? "n1 is greater & the Greater Value is :- "+n1 : "n2 is Greater the Greater Value is :- "+n2;
        System.out.println(str);
        System.out.println();

        // Que. No : 2 :- WAP to find Greatest of three number using ternary operator.....
        System.out.println("Enter the 3rd Number :- ");
        int n3 = sc.nextInt();
        String str1;
        str1 = (n1>n2) ? (n1>n3) ? "n1 is Greater & it's value is :- "+n1  : "n3 is Greater & it's value is :- " +n3 : (n2>n3) ? "n2 is Greater & it's value is :- "+n2: "n3 is Greater & it's value is :- "+n3;
        System.out.println(str1);
        System.out.println();

        // Que. No : 3 :- WAP to calculate number of digit in a number using while loop.........
        char ch;
        do {
            System.out.println("Enter a Positive Integer number in which you want count the number of digit :- ");
            int num = sc.nextInt();
            int count = 0;
            while (num > 0) {
                num = num / 10;
                count++;
            }
            System.out.println("The digit in the entered number is :- " + count);
            System.out.println("Do you want to continue ?(y/n) ");
            ch = sc.next().charAt(0);
        }while (ch == 'y');
        {

        }



    }
}
