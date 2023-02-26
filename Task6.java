import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        ArrayList<String> barang = new ArrayList<String>();
        ArrayList<Integer> stok = new ArrayList<Integer>();

        System.out.println("Masukkan jumlah jenis barang : ");
        int jenis = scan.nextInt();

        for (int i = 0; i <= jenis; i++){

            System.out.println("Masukkan Nama barang ke-"+i+" : ");
            barang.add(scan.nextLine());
        }

        for (int i = 0; i <= jenis; i++){

            System.out.println("Masukkan Banyak barang ke-"+i+" : ");
            stok.add(scan.nextInt());
        }




    }
}
