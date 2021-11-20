// Assignment of (17/11/2021) class taken by Jay Sir !

import java.util.Scanner;

public class Assignment_17_11_2021 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Que. No - 1 :- WAP check whether user given input number is 1 digit, 2 digit, 3 digit, 4 digit, 5 digit and more than 5 digit

        System.out.println("Que. No - 1 :-");
        System.out.println("Enter a Number in which You want to count digits :- ");
        int number = sc.nextInt();
        int n1 = number;
        int count = 0;
        while (number>0){
            number = number/10;
            count++;
        }
        if (count==1){
            System.out.println("given input number is 1 digit & the number is :- "+n1);
        }
        else if (count==2){
            System.out.println("given input number is 2 digit & the number is :- "+n1);
        }
        else if (count==3){
            System.out.println("given input number is 3 digit & the number is :- "+n1);
        }
        else if (count==4){
            System.out.println("given input number is 4 digit & the number is :- "+n1);
        }
        else if (count==5){
            System.out.println("given input number is 5 digit & the number is :- "+n1);
        }
        else {
            System.out.println("given input number is more than 5 digit & the number is :- "+n1);
        }
        System.out.println();

        // Calling of Que. - 2 :-
        System.out.println("Que. No - 2 :- ");
        System.out.println("Enter the Score");
        int Score = sc.nextInt();
        checkGrade(Score);
        System.out.println();

        /*
        Que. No : 3 :- write program to print different courses needs to be studied by students of different years and branch
        Expln:
        - Take branch(String, ie ECE, CSE, MEC) and year(int i.e 1,2,3,4) as input from user and print courses user need to study
                -  1st year -> for all branches -> English, Maths, Science
                -  2nd year ->  CSE-> Operating System, Java, Data Structure
        ECE-> Micro processors, Logic switching theory
        MEC-> Drawing, Manufacturing Machines
                - 3rd year -> CSE ->Computer Organization, MultiMedia
        ECE-> Fundamentals of Logic Design, Microelectronics
        MECH->Internal Combustion Engines, Mechanical Vibration
                - 4th year -> CSE->Data Communication and Networks, MultiMedia
        ECE->Embedded System, Image Processing
        MECH->Production Technology, Thermal Engineering" */

        System.out.println("Solution of Que. No : 3 :-");
        System.out.println("Enter Year( 1,2,3,4)");
        int year = sc.nextInt();
        System.out.println("Enter the Branch( ECE, CSE, MEC)");
        String branch = sc.next();
        if (year == 1){
            System.out.println("English, Maths, Science");
        }else if (year == 2 && branch.equals("CSE")){
            System.out.println("Operating System, Java, Data Structure");
        }else if (year == 2 && branch.equals("ECE")){
            System.out.println("Micro processors, Logic switching theory");
        }else if (year == 2 && branch.equals("MEC")){
            System.out.println("Drawing, Manufacturing Machines");
        }
        else if (year == 3 && branch.equals("CSE")){
            System.out.println("Computer Organization, MultiMedia");
        }else if (year == 3 && branch.equals("ECE")){
            System.out.println("Fundamentals of Logic Design, Microelectronics");
        }else if (year == 3 && branch.equals("MEC")) {
            System.out.println("enternal Combustion Engines, Mechanical Vibration");
        }
        else if (year == 4 && branch.equals("CSE")){
            System.out.println("Data Communication and Networks, MultiMedia");
        }else if (year == 4 && branch.equals("ECE")){
            System.out.println("Embedded System, Image Processing");
        }else if (year == 4 && branch.equals("MEC")) {
            System.out.println("Production Technology, Thermal Engineering");
        }
        else {
            System.out.println("Invalid Entry");
        }

    }

    /*
     Que. No - 2 :- write a method to print different grades of students by passing their score
    Expln:
     - less then 50 -> fail
     - 50 - 59 -> D grade
     - 60 - 69 -> C grade
     - 70 - 79 -> B grade
     - 80 - 89 -> A grade
     - 90 - 100 -> A+ grade
     - None of above -> Invalid
     */

    public static void checkGrade(int Score){
        if (Score <= 100 && Score >= 90){
            System.out.println("Grade A+");
        }
        else if (Score <= 89 && Score >= 80){
            System.out.println("Grade A");
        }
        else if (Score <= 79 && Score >= 70){
            System.out.println("Grade B");
        }
        else if (Score<= 69 && Score>= 60){
            System.out.println("Grade C");
        }
        else if (Score <= 59 && Score >= 50){
            System.out.println("Grade D");
        }else {
            System.out.println("Fail");
        }
    }

}
