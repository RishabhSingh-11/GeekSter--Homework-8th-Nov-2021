//Assignment of (19/11/2021) class taken by Jay Sir !

import java.util.Scanner;

public class Assignment_19_11_2021 {

    // Que. No : 1 :- write a method which takes 2 numbers and 1 char(operation +, -, *, /) and performs the operation and returns the ans....

    double result = 0;

    public double operatorTesting(int a, int b, char ch){
        if (ch == '+'){
            result = a+b;
        }
        else if (ch == '-'){
            result = a-b;
        }
        else if (ch == '*'){
            result = a*b;
        }
        else if (ch == '/'){
            result = (float)a/b;
        }
        else {
            System.out.println("Wrong Operator");
        }
        return result;
    }

    //  Que. No : 2 :- Program to take two numbers as input and print their relationship.......

    public void checkRelation(int a, int b){
        if (a == b){
            System.out.println("a is equal to b");
        }
        else if (a > b){
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("a is less than b");
        }
    }


    public static void main(String[] args) {
        Assignment_19_11_2021 As = new Assignment_19_11_2021();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Number :- ");
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd Number :- ");
        int n2 = sc.nextInt();
        System.out.println("Enter the Operators(+, -, *, /) :- ");
        char ch = sc.next().charAt(0);
        System.out.println(As.operatorTesting(n1,n2,ch));
        System.out.println();

        // Calling of Que. 2 :-
        System.out.println("Entered the value for Question - 2 :-");
        System.out.println("Enter the value of a :- ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :- ");
        int b = sc.nextInt();
        As.checkRelation(a,b);




    }
}
