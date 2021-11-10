import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        for (int i=1; i<=num; i++){
            if(num%i == 0){

                count = count + 1;
            }
        }
        if(count == 2){
            System.out.println("The Number is Prime");
        }
        else{
            System.out.println("The Number is Not Prime");
        }
    }
}
