import java.util.Scanner;

public class Task2 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan bilangan yang ingin dipangkatkan : ");
        int angka = scan.nextInt();
        System.out.println("Masukkan bilangan pemangkatnya : ");
        int pangkat = scan.nextInt();

        //======================== for =============================

        int hasilfor = angka;

        for (int i = 1; i < pangkat ; i++){
            hasilfor = hasilfor*angka;
        }

        System.out.println("Hasilnya adalah : " + hasilfor);

        //======================== while =============================

        int hasilwhile = angka;
        int x = 1;

        while (x < pangkat){
            hasilwhile = hasilwhile*angka;
            x += 1;
        }

        System.out.println("Hasilnya adalah : "+hasilwhile);

        //======================== do =============================

        int hasildo = angka;
        int y = 1;

        do {

            hasildo = hasildo * angka;
            y += 1;

        }while(y<pangkat);

        System.out.println("Hasilnya adalah : "+hasildo);
    }
}
