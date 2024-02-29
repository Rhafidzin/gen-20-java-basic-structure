

public class Main {

    static void aritmatika(int a, int b){
        int sum = a + b;
        System.out.println("Hasil dari penjumlahan = " + sum);
    }

    static void segitiga(int n){
        for (int i = 1; i <= n; i++){

            for(int j = n; j > i ; j--){
                System.out.print(" ");
            }

            for(int k = 1; k <= (i*2)-1; k++){
            System.out.print("*");
            }

            System.out.println();
        }
    }

    static void evenOdd(int a, int b){
        int sum = a + b + 1;
        if(sum % 2 == 0) {
            System.out.println("Ganjil");
        } else {
            System.out.println("Genap");
        }
    }

    public static void main(String[] args){
        aritmatika(4,11);
        segitiga(5);
        evenOdd(3, 4);
    }
}
