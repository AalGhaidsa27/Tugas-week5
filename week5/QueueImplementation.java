package week5;

import java.util.LinkedList;
import java.util.Scanner;

public class QueueImplementation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> queue = new LinkedList<>();
        int choice;

        do {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Check Empty");
            System.out.println("5. Check full");
            System.out.println("6. Size");
            System.out.print("Your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan angka: ");
                    int num = input.nextInt();
                    queue.add(num);
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        System.out.println("Elemen yang dihapus: " + queue.remove());
                    } else {
                        System.out.println("Queue kosong!");
                    }
                    break;
                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println("Elemen teratas: " + queue.peek());
                    } else {
                        System.out.println("Queue kosong!");
                    }
                    break;
                case 4:
                    System.out.println("Apakah queue kosong? " + queue.isEmpty());
                    break;
                case 5:
                    System.out.println("Size queue: " + queue.size());
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 6);

        input.close();
    }
}
