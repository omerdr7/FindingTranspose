package findin.transpose;

import java.util.Scanner;

public class FindingTranspose {

    public static void printMatrix() {
        int row;
        int column;
        System.out.println("Please give the column of matrix:");
        Scanner s = new Scanner(System.in);
        column = s.nextInt();
        System.out.println("Please give the row of matrix:");
        row = s.nextInt();
        int[][] matrix = new int[column][row];
        int[][] transpozeMatrix = new int[row][column];
        System.out.println("Now give the members of matrix.");
        for (int i = 0; i <= column - 1; i++) {
            for (int j = 0; j <= row - 1; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.println("Matrix A= ");
    }

    public static void main(String[] args) {

    }

}
