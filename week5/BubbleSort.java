package week5;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tukar elemen
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Cetak iterasi perubahan posisi angka
            System.out.print("Iterasi " + (i + 1) + ": ");
            printArray(arr);

            // Jika tidak ada pertukaran, array sudah terurut
            if (!swapped) break;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Array sebelum sorting:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Array setelah sorting:");
        printArray(arr);

        input.close();
    }
}
