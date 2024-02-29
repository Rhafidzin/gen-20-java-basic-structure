

public class Main {

    static void segitiga(int n){
        //membuat looping kondisi sesuai nilai n
        for (int i = 1; i <= n; i++){
            // menghasilkan spasi
            for(int j = n; j > i ; j--){
                System.out.print(" ");
            }
            // menghasilkan bintang
            for(int k = 1; k <= (i*2)-1; k++){
            System.out.print("*");
            }

            System.out.println();
        }
    }

    static void evenOdd(int a, int b){
        //membuat variabel sum sebagai hasil penjumlahan
        int sum = a + b + 1;
        if(sum % 2 == 0) {
            System.out.println(sum + " adalah Genap");
        } else {
            System.out.println(sum +" adalah Ganjil");
        }

    }

    public static void main(String[] args){
        // memanggil method
        segitiga(5);
        evenOdd(3, 4);
    }
}
