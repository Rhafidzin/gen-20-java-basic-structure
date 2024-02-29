
// import Scanner
import java.util.Scanner;

public class Aritmatika {
    static void kalkulasi(){
        //membuat variable bertipe data float
        float number1, number2, result;

        //memanggil Scanner dengan nama input
        Scanner input = new Scanner(System.in);

        //memberikan opsi operator
        System.out.println("Pilih operator : ");
        System.out.println("+ = tambah");
        System.out.println("- = kurang");
        System.out.println("* = kali");
        System.out.println("/ = bagi");

        // membuat variable operator untuk menampung hasil sebelumnya
        char operator = input.next().charAt(0);

        //memberikan opsi input angka
        System.out.println("Masukkan angka pertama : ");
        number1 = input.nextFloat();
        System.out.println("Masukkan angka kedua : ");
        number2 = input.nextFloat();

        //switch case mengoperasikan variable operator sebelumnya
        switch (operator) {

            // menghasilkan penambahan
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // menghasilkan pengurangan
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // menghasilkan perkalian
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // menghasilkan pembagian
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }

    public static void main(String[] args){
        // memanggil method
        kalkulasi();
    }
}
