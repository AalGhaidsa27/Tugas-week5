package week5;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah Data : ");
        int jumlah = input.nextInt();

        int[] data = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Data ke - " + (i + 1) + " = ");
            data[i] = input.nextInt();
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Hasil nilai[" + i + "]=" + data[i]);
        }

        input.close();
    }
}
