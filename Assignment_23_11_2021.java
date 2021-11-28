// Assignment of (23/11/2021) class taken by Rakhi Ma'am !

import java.util.Scanner;

public class Assignment_23_11_2021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Que. No - 1 :- WAP to find 1st index at which element is present in array..............
        System.out.println("Solution of Que. No - 1 :- ");
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values in array :- ");
        for (int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        boolean isFound = false;
        int index = -1;
        System.out.println("Enter the element which you want to Search :- ");
        int searchElement = sc.nextInt();
        for (int i=0; i<arr.length; i++){
            if (arr[i] == searchElement){
                isFound = true;
                index = i;
                break;
            }
        }
        System.out.println("Element is found at index :- "+index);
        System.out.println();


        // Que. No - 1 :- WAP to find 1st index at which element is present in array..............
        System.out.println("Solution of Que. No - 2 :- ");
        System.out.println("Enter the size of array : ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the values in array :- ");
        for (int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        boolean isFound1 = false;
        int index1 = -1;
        System.out.println("Enter the element which you want to Search :- ");
        int searchElement1 = sc.nextInt();
        for (int i=0; i<arr1.length;i++){
            if (arr1[i] == searchElement1){
                isFound1 = true;
                index1 = i;
            }
        }
        System.out.println("Element is found at index :- "+index1);
        System.out.println();


        // Que. No - 3 :- WAP to find difference in 2 Arrays.................
        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = a.length;
        int[] result = new int[num];
        for (int i=0; i<num; i++){
            result[i] = a[i] - b[i];
        }
        for (int i=0; i<num; i++){
            System.out.println(result[i]);
        }


        // Que. No - 4 :- WAP to convert binary number to decimal.............
        System.out.println("Enter a binary number :- ");
        int binary = sc.nextInt();
        int decimal = 0;
        int i = 0;
        while (binary>0){
            int r = binary%10;
            binary = binary/10;
            decimal = decimal+ r*(int)Math.pow(2, i++);
        }
        System.out.println("The decimal Value is : "+decimal);
    }
}
