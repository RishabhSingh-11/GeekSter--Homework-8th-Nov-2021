/* Overloading:

Write a method that overloads the talk method by taking in a name and printing “Hello” with that name.

*/

import java.util.Scanner;

public class Test2 {
    public static void talk() {
        System.out.println("hello there!");
    }

    public static void talk(String name)  // FINISH THE METHOD HERE //
    {
        System.out.println("Hello " + name);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Name :- ");
        String str = sc.nextLine();
        talk(str);
    }
}