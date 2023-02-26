import java.util.ArrayList;
import java.util.Arrays;

public class Assigment1 {
    public static void main(String[] args) {
        // Daftar barang yang akan dibeli
        String[] daftarBarang = {"cabai", "bayam", "bawang", "tempe", "beras"};

        // Harga masing-masing barang
        int[] harga = {3000, 2000, 3000, 5000, 20000};

        // Uang yang dibawa Dina
        int uangDina = 50000;

        // Membuat ArrayList untuk menyimpan barang yang dibeli Dina
        ArrayList<String> barangDibeli = new ArrayList<>();

        // Menghitung total belanja Dina
        int totalBelanja = 0;
        for (int i = 0; i < daftarBarang.length; i++) {
            // Jika barang tersebut tidak dibeli Dina
            if (daftarBarang[i].equals("cabai")) {
                continue;
            }

            // Jika barang tersebut dibeli Dina
            int hargaBarang = harga[i];
            totalBelanja += hargaBarang;


            barangDibeli.add(daftarBarang[i]);
        }

        // Menambahkan barang baru yang dibeli Dina
        barangDibeli.add("ayam");
        barangDibeli.add("minyak");
        totalBelanja += harga[4] + harga[2];

        // Menampilkan daftar catatan Dina
        System.out.println("Daftar catatan Dina: " + Arrays.toString(daftarBarang));

        // Menampilkan barang yang dibeli Dina
        System.out.println("Barang yang dibeli Dina: " + barangDibeli);

        // Menampilkan total belanja Dina serta keterangan kurang, pas, atau lebih
        System.out.println("Total belanja Dina: " + totalBelanja);
        if (totalBelanja < uangDina) {
            System.out.println("Kurang " + (uangDina - totalBelanja));
        } else if (totalBelanja == uangDina) {
            System.out.println("Pas");
        } else {
            System.out.println("Lebih " + (totalBelanja - uangDina));
        }
    }
}
