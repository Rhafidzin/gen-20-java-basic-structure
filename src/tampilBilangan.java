
//memanggil scanner
import java.util.Scanner;

public class tampilBilangan {

    static void inputBilangan(){
        // inisialisasi variabel string kosong
//        String result = "";

        //memanggil scanner dengan nama input
        Scanner input = new Scanner(System.in);

        System.out.println("Melihat bilangan bulat positif \npertama yang habis dibagi 3 tetapi tidak habis dibagi 2");
        System.out.println("Masukkan nilai awal");
        // menerima input nilai n1
        int n1 = input.nextInt();

        System.out.println("Masukkan nilai akhir");
        //menerima input nilai n2
        int n2 = input.nextInt();

        System.out.println("Berikut hasil dari jarak " + n1 + " sampai " + n2);
        // looping sesuai kondisi dari nilai n1 sampai n2
        for(int i = n1; i <= n2; i++){
            // membuat konidisi menggunakan if
            if(i % 2 != 0 && i % 3 == 0) {
                // output jika sesuai kondisi yang diinginkan dan break loop
                System.out.println(i + " adalah Benar");
                break;
            } else {
                // output jika tidak sesuai kondisi dan melanjutkan loop
                System.out.println(i + " adalah Salah");
            }
        }
    }
    public static void main(String[] args){
        // memanggil method
        inputBilangan();
    }
}
