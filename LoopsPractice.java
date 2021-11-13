// Assignment of Day-4 (11/11/2021) class taken by Rakhi Ma'am !
//1st Part All Questions using for loop........
//2nd Part All Questions using while loop......

import java.util.Scanner;

public class LoopsPractice {
            public static void main(String args[]) {



                // Solution No. - 1 :- Sum of n numbers using for loop............

                System.out.println("Solution No. - 1 :- Sum of n numbers using for loop............");
                int i, sum = 0;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number");
                int n = sc.nextInt();
                for(i=1;i<=n;i++){
                    sum = sum + i;
                }

                System.out.println("Sum of n Number :- "+sum);
                System.out.println();

                // Solution No. - 2 :- Factorial of n numbers using for loop...........
                System.out.println("Solution No. - 2 :- Factorial of n numbers using for loop.........");
                int fact = 1;
                System.out.println("Enter the Number");
                int n1 = sc.nextInt();
                for(i=n1;i>=1;i--){
                    fact = fact * i;
                }
                System.out.println("Factorial of n Number is :- "+fact);
                System.out.println();

                // Solution No. - 3 :- Swap two numbers using the 3rd Variable...........
                System.out.println("Solution No. - 3 :- Swap two numbers using the 3rd Variable...........");
                System.out.println("Enter the 1st Number :-");
                int a = sc.nextInt();
                System.out.println("Enter the 2nd Number :-");
                int b = sc.nextInt();
                int temp;
                temp = a;
                a = b;
                b = temp;
                System.out.println("Value of a after Swaping :- "+a);
                System.out.println("Value of b after Swaping :- "+b);
                System.out.println();

                // Solution No. - 4 :- Print Table of any Number in format "n * 1 = n" using for loop ...............
                System.out.println("Solution No. - 4 :- Print Table of any Number in format n * 1 = n using for loop....");
                System.out.println("Enter the Number :- ");
                int n2 = sc.nextInt();
                int Product = 1;
                for (i=1; i<=10;i++){
                    Product = n2 * i;
                    System.out.println(n2+ " * " + i + " = " + Product);
                }
                System.out.println();


//                All above Questions using While Loop

                // Solution No. - 1 :- Sum of n numbers using while loop............

                System.out.println("Solution No. - 1 :- Sum of n numbers using while loop............");
                int j = 1, sum1 = 0;
                System.out.println("Enter the limit :- ");
                int x = sc.nextInt();
                while(j<=x){
                    sum1 = sum1 + j;
                    j++;
                }
                System.out.println("Sum of n number is :- " + sum1);
                System.out.println();

                // Solution No. - 2 :- Factorial of n numbers using while loop...........
                System.out.println("Solution No. - 2 :- Factorial of n numbers using while loop.........");
                int fact1 = 1;
                System.out.println("Enter the Number :- ");
                int n3 = sc.nextInt();
                int k = n3;
                while(k>=1){
                    fact1 = fact1 * k;
                    k--;
                }
                System.out.println("Factorial of n Number is :- "+fact1);
                System.out.println();

                // Solution No. - 3 :- Print Table of any Number in format "n * 1 = n" using while loop ...............
                System.out.println("Solution No. - 3 :- Print Table of any Number in format n * 1 = n using while loop....");
                System.out.println("Enter a Number for Table");
                int num = sc.nextInt();
                int pro = 1, z = 1;
                while(z<=10){
                    pro = num * z;
                    System.out.println(num + " * " + z + " = " + pro);
                    z++;
                }



    }

}

