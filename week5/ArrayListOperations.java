package week5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> sum = new ArrayList<>();
        ArrayList<Integer> diff = new ArrayList<>();
        ArrayList<Integer> product = new ArrayList<>();
        ArrayList<Double> division = new ArrayList<>();

        System.out.print("Masukkan jumlah elemen dalam list: ");
        int n = input.nextInt();

        System.out.println("Masukkan elemen list 1:");
        for (int i = 0; i < n; i++) {
            list1.add(input.nextInt());
        }

        System.out.println("Masukkan elemen list 2:");
        for (int i = 0; i < n; i++) {
            list2.add(input.nextInt());
        }

        // Operasi aritmatika
        for (int i = 0; i < n; i++) {
            sum.add(list1.get(i) + list2.get(i));
            diff.add(list1.get(i) - list2.get(i));
            product.add(list1.get(i) * list2.get(i));
            if (list2.get(i) != 0) {
                division.add((double) list1.get(i) / list2.get(i));
            } else {
                division.add(null);
            }
        }

        System.out.println("Hasil Penjumlahan: " + sum);
        System.out.println("Hasil Pengurangan: " + diff);
        System.out.println("Hasil Perkalian: " + product);
        System.out.println("Hasil Pembagian: " + division);

        input.close();
    }
}
