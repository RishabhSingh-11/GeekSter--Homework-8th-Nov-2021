// Assignment of (25/11/2021) class taken by Rakhi Ma'am !

public class Assignment_25_11_2021 {
    public static void main(String[] args) {

        // Que. No - 1 :- WAP to add two 2D matrices to get the result matrix.........

        System.out.println("Solution of Que. No - 1 :- ");
        int[][] a = {{1,2,3},
                     {4,5,6},
                     {7,8,9},
        };

        int[][] b = {{1,2,3},
                     {4,5,6},
                     {7,8,9},
        };

        int row = a.length;
        int col = a[0].length;

        int[][] result = new int[row][col];

        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        // Que. No - 2 :- WAP to Print the matrix column wise............

        System.out.println("Solution of Que. No - 2 :- ");
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9},
        };

        int r = a.length;
        int c = a[0].length;

        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }


    }
}
