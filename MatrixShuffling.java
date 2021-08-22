package EXERCISE;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        String[][] matrix = new String[n][m];
        inputMatrixMxN(sc, matrix, n, m);


        String inf = sc.nextLine();
        while (!inf.equals("END"))
        {
            String[] info = inf.split(" ");
            if(info[0].equals("swap") && info.length == 5){
                int row1 = Integer.parseInt(info[1]);
                int col1 = Integer.parseInt(info[2]);
                int row2c = Integer.parseInt(info[3]);
                int col2 = Integer.parseInt(info[4]);
                if(row1 < n && row2c < n && col1 < m && col2 < m){
                    swapMatrix(matrix,n,m,row1,col1,row2c,col2);
                } else{
                    System.out.println("Invalid input!");
                }
            } else {
                    System.out.println("Invalid input!");
            }
            inf = sc.nextLine();
        }


    }

    public static void swapMatrix(String[][] matrix, int n, int m, int row1, int col1, int row2c, int col2)
    {
        String oldEl = matrix[row1][col1];
        String newEl = matrix[row2c][col2];

        for (int row = 0; row < n; row++) {
            for (int column = 0; column < m; column++) {
                if(row == row1 && column == col1){
                    matrix[row1][col1] = newEl;
                }
                if(row == row2c && column == col2){
                    matrix[row2c][col2] = oldEl;
                }
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

    }

    public static void inputMatrixMxN(Scanner sc, String[][] matrix, int n, int m)
    {
        for (int row = 0; row < n; row++) {
            String[] inputTokens = sc.nextLine().split(" ");
            for (int column = 0; column < m; column++) {
                matrix[row][column] = inputTokens[column];
            }
        }
    }
}
