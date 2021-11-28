// Assignment of (22/11/2021) class taken by Rakhi Ma'am !

import java.util.Scanner;

public class Assignment_22_11_2021 {

    public static void main(String[] args) {

        // Que. No - 1 :- make an array with user inputs of size 10, then find sum of all the elements in array.......
        Scanner sc = new Scanner(System.in);
        System.out.println("Solution of Que. No - 1 :- ");
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values in array :- ");
        for (int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i=0; i<arr.length;i++){
           sum = sum + arr[i];
        }
        System.out.println("The sum of all the element which is present in array is :- "+sum);
        System.out.println();


       // Que. No - 2 :- make an array with user inputs of size 10, then find the middle element in array.......

        System.out.println("Solution of Que. No - 2 :- ");
        System.out.println("Enter the size of array : ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the values in array :- ");
        for (int i=0; i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        int startIndex = 0;
        int lastIndex = arr1.length-1;
        int mid = (lastIndex - startIndex)/2;
        System.out.println("The middle element in array is :- "+arr1[mid]);
        System.out.println();


        // Que. No - 3 :- make an array with user inputs of size 10, then prints all +ive numbers in an array.......

        System.out.println("Solution of Que. No - 3 :- ");
        System.out.println("Enter the size of an array :- ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the values in array :- ");
        for (int i=0; i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }

        for (int i=0; i<arr2.length;i++){
            if (arr2[i] >=0 ){
                System.out.println( arr2[i]);
            }
        }


    }
}
