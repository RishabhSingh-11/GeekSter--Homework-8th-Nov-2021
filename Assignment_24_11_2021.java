// Assignment of (24/11/2021) class taken by Jay Sir !

import java.util.Scanner;

public class Assignment_24_11_2021 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Que. No - 1 :- WAP to search a word inside a String........

        System.out.println("Solution of Que. No - 1 :- ");
        String str = "Geekster is a Place where we boost our career";
        System.out.println("Enter a word which You want to Search inside given String :- ");
        String searchString = sc.nextLine();
        int intIndex = str.indexOf(searchString);
        if(intIndex == -1){
            System.out.println(searchString + " not found ! ");
        }else {
            System.out.println(searchString + " Found at index :- " + intIndex);

        }
        System.out.println();


        // Que. No - 2 :- WAP to convert all the 1st char of a words in a sentence to UpperCase.........

        System.out.println("Solution of Que. No - 2 :- ");
        String msg = "every programmer should learn java";
        char[] ch = msg.toCharArray();
        boolean foundSpace = true;
        for (int i=0; i<ch.length;i++){
            if (Character.isLetter(ch[i])){
                if (foundSpace){
                    ch[i] = Character.toUpperCase(ch[i]);
                    foundSpace = false;
                }
            }
            else {
                foundSpace=true;
            }
        }
        msg = String.valueOf(ch);
        System.out.println("Message : "+msg);
        System.out.println();


        // Que. No - 3 :- WAP to reverse a Sentence..........

        System.out.println("Solution of Que. No - 3 :- ");
        System.out.println("Enter a String :- ");
        String originalString = sc.nextLine();
        String result = " ";
        char[] ch1 = originalString.toCharArray();
        for (int i=0; i<ch1.length;i++){
            result = ch1[i] + result;
        }
        System.out.println(result);
        System.out.println();


        // Que. No - 4 :- WAP to check given String is Palindrome or not ? ................

        System.out.println("Solution of Que. No - 4 :- ");
        System.out.println("Enter a String :- ");
        String str1 = sc.nextLine();
        int start = 0;
        int end = str1.length()-1;
        while (start<end){
            if(str1.charAt(start)!=str1.charAt(end)){
                System.out.println("Not a Palindrome");
                break;
            }
            start++;
            end--;
        }
        System.out.println("Palindrome");

    }
}
