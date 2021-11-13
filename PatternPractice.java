// Assignment of Day-5 (12/11/2021) class taken by Jay Sir !

 public class PatternPractice {
    public static void main(String[] args) {

//      Simple Pattern..........
        System.out.println("1 -: Simple Pattern..........");
        int i, j, n = 5;
        for(i = 1; i<=n; i++){
            System.out.print("* ");
        }
        System.out.println();
        System.out.println();

//      Square Pattern.........
        System.out.println("2 :- Square Pattern.........");
        for(i=1; i<=n; i++){

            for(j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

//      Triangle Pattern.........
        System.out.println("3 :- Triangle Pattern.........");
        for(i=1;i<=n;i++){
            for(j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
        System.out.println();

//      Inverse Triangle..........
        System.out.println("4 :- Inverse Triangle..........");
        for (i=5; i>=1; i--){
            for (j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

//      Right Pascal's Triangle...............
        System.out.println("5 :- Right Pascal's Triangle........");
        for(i=1;i<=n;i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

            for(i=n-1;i>=1;i--){
                for(j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        System.out.println();

//      Triangle Pattern using Number..........
        System.out.println("6 :- Triangle Pattern using Number..........");
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

//      Triangle Pattern using Number..........
        System.out.println("7 :- Triangle Pattern using Number..........");
        int count = 1;
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

//      Triangle Pattern........
        System.out.println("8 :- Triangle Pattern........");
        for (i=1;i<=n;i++){
            for (j=(n-i);j>=1 ;j--){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

//      Pyramid Pattern........
        System.out.println("9 :- Pyramid Pattern........");
        for (i=1;i<=n;i++){
            for (j=(n-i);j>=1 ;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

//      Reverse pyramid Pattern.................
        System.out.println("10 :- Reverse Pyramid Pattern........");
        for (i=n;i>=1;i--){
            for (j=i;j<=n;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

//      Diamond Pattern........
        System.out.println("11 :- Diamond Pattern........");
        for (i=1;i<=n;i++){
            for (j=(n-i);j>=1 ;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i=n-1;i>=1;i--){
            for (j=i+1;j<=n;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
