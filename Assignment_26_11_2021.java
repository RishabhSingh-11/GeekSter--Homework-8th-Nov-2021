// Assignment of (24/11/2021) class taken by Jay Sir !

public class Assignment_26_11_2021 {
    public static void main(String[] args) {

        // Que. No - 1 :- WAP to lower Triangular Matrix..............

        System.out.println("Solution of Que. No - 1 :- ");
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}
        };

        int row = matrix.length;
        int col =matrix[1].length;

        if (row != col){
            System.out.println("Matrix should be a Square Matrix");
        }

        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if (j>i){
                    System.out.print(0+" ");
                }
                else {
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println();

        }
        System.out.println();


        // Que. No - 2 :- WAP to determine if a given matrix is sparse matrix or not ?............

        System.out.println("Solution of Que. No - 2 :- ");
        int[][] matrix1 = {{1,0,0},
                           {0,0,2},
                           {0,2,1}};

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int zero = 0;
        int count = 0;

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (matrix1[i][j] == 0){
                    zero++;
                }else {
                    count++;
                }
            }
        }
        if (zero > count){
            System.out.println("It's a Sparse MAtrix");
        }else {
            System.out.println("It's not a Sparse MAtrix");
        }
        System.out.println();


        // Que. No - 3 :- WAP to find the frequency of odd & even Numbers in the given matrix........
        System.out.println("Solution of Que. No - 3 :- ");
        int[][] matrix2 = {{2,2,2},
                           {2,2,2},
                           {7,7,7}};

        int r = matrix2.length;
        int c = matrix2[0].length;
        int evenOccurance = 0;
        int oddOccurance = 0;

        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                if (matrix2[i][j] % 2 == 0){
                    evenOccurance++;
                }else {
                    oddOccurance++;
                }
            }
        }
        System.out.println("frequency of even Numbers :- " + evenOccurance);
        System.out.println("frequency of odd Numbers :- " + oddOccurance);


    }
}
