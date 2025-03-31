package week5;

import java.util.ArrayList;
import java.util.Scanner;

class DataNilai {
    private int nilai;

    public DataNilai(int nilai) {
        this.nilai = nilai;
    }

    public int getNilai() {
        return nilai;
    }
}

public class ArrayObjek {
    private ArrayList<DataNilai> daftarNilai = new ArrayList<>();

    public void tambahNilai(int nilai) {
        daftarNilai.add(new DataNilai(nilai));
    }

    public void daftarNilai() {
        System.out.println("Daftar Nilai:");
        for (int i = 0; i < daftarNilai.size(); i++) {
            System.out.println("Nilai ke-" + (i + 1) + " = " + daftarNilai.get(i).getNilai());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayObjek array = new ArrayObjek();

        System.out.print("Masukkan jumlah data: ");
        int jumlah = input.nextInt();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            int nilai = input.nextInt();
            array.tambahNilai(nilai);
        }

        array.daftarNilai();

        input.close();
    }
}

