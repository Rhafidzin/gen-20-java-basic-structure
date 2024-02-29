
// memanggil scanner
import java.util.Scanner;

public class nilaiPertama {

    static void hasilJumlah(){
        // inisiasi variable sum dengan nilai awal 0
        int sum = 0;
        // memanggil scanner dengan nama input
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai n maksimal!");
//        menerima nilai input n
        int n = input.nextInt();

        // melakukan looping
        for(int i = 1; i <= n; i++){
            //melakukan penjumlahan dari variable sum dan i dari loop
            sum += i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        //memanggil method
        hasilJumlah();
    }
}
