// Assignment of (15/11/2021) class taken by Jay Sir !

import java.util.Scanner;

public class Assignment_15_11_2021 {

    // Que. No - 1 :- Write a method that multiplies 2 numbers and returns the answer...
    public int multiply(int n1, int n2){
       return n1*n2;
    }

    /* Que. No - 2 :- Write 3 different methods each takes int, float, long numbers as input and returns it's
       multiplication value */

    public int mul(int num1, int num2){
        return num1*num2;
    }

    public float mul(float num1, float num2){
        return num1*num2;
    }

    public long mul(long num1, long num2){
        return num1*num2;
    }

//    Que. No - 3 :- Write 3 different methods each takes different number of int arguments and return it's max value

    public int findMaxValue(int x, int y){
        if (x>y){
            return x;
        }else {
            return y;
        }
    }

    public int findMaxValue(int x, int y, int z){
        if (x>y && x>z){
            return x;
        }
        else if (y>x && y>z){
            return y;
        }
        else {
            return z;
        }
    }

    public int findMaxValue(int x, int y, int z, int w){
        if (x>y && x>z && x>w){
            return x;
        }
        else if (y>x && y>z && y>w){
            return y;
        }
        else if (z>x && z>y && z>w){
            return z;
        }
        else {
            return w;
        }

    }

    // Write a method to return sum of array....
    int [] arr = new int[5];
    public int sumOfArray(int[] arr){
        int Sum = 0;
        for (int i=0; i<=arr.length; i++){
            Sum = Sum + i;
        }
        return Sum;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Assignment_15_11_2021 ob = new Assignment_15_11_2021();

//      Function Calling of Question :- 1
        System.out.println("Que. No - 1 :-");
        System.out.println("Enter the 1st Number :- ");
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd Number :- ");
        int n2 = sc.nextInt();
        System.out.println("The Product of two number is :- "+ob.multiply(n1, n2));
        System.out.println();

//      Function Calling of Question :- 2
        System.out.println("Que. No - 2 :-");
        System.out.println(ob.mul(10,10));
        System.out.println(ob.mul(5.4f,5.8f));
        System.out.println(ob.mul(5000,1000));
        System.out.println();

//      Function Calling of Question :- 3
        System.out.println("Que. No - 2 :-");
        System.out.println(ob.findMaxValue(10,9));
        System.out.println(ob.findMaxValue(10,11,25));
        System.out.println(ob.findMaxValue(45,55,65,75));
        System.out.println();

//      Function Calling of Question :- 4
        System.out.println(ob.sumOfArray(new int[]{1, 2, 3, 4, 5}));



    }
}
