package week5;

import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rowsA = getValidInt(input, "Masukkan jumlah baris matriks A: ");
        int colsA = getValidInt(input, "Masukkan jumlah kolom matriks A (dan jumlah baris matriks B): ");
        int colsB = getValidInt(input, "Masukkan jumlah kolom matriks B: ");

        int[][] A = new int[rowsA][colsA];
        int[][] B = new int[colsA][colsB];
        int[][] product = new int[rowsA][colsB];

        System.out.println("Masukkan elemen matriks A:");
        inputMatrix(A, input);

        System.out.println("Masukkan elemen matriks B:");
        inputMatrix(B, input);

        multiplyMatrices(A, B, product);
        System.out.println("Hasil Perkalian Matriks:");
        displayMatrix(product);

        input.close();
    }

    public static int getValidInt(Scanner input, String message) {
        System.out.print(message);
        while (!input.hasNextInt()) {
            System.out.println("Input harus berupa angka. Coba lagi!");
            input.next();
            System.out.print(message);
        }
        return input.nextInt();
    }

    public static void inputMatrix(int[][] matrix, Scanner input) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = getValidInt(input, "Elemen [" + i + "][" + j + "]: ");
            }
        }
    }

    public static void multiplyMatrices(int[][] A, int[][] B, int[][] product) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                product[i][j] = 0;
                for (int k = 0; k < A[0].length; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
