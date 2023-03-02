import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yıldız deseninin oluşturulması için bir sayi giriniz: ");
        int number = scan.nextInt();

        int i, j;

        // Dış döngü 1
        // Elmasın ilk yarısını bastırır
        for (i = 1; i <= number; i++) {

            // İç döngü 1
            // Aradaki boşlukları bastırır
            for (j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }

            // İç döngü 2
            // Yıldızları bastırır
            for (j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            // Bitiş satırı
            System.out.println();
        }

        // Dış döngü 2
        // Elmasın ikinci yarısını bastırır
        for (i = number - 1; i > 0; i--) {

            // İç döngü 1
            // Aradaki boşlukları bastırır
            for (j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }

            // İç döngü 2
            // Yıldızları bastırır
            for (j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            // Bitiş satırı
            System.out.println();
        }
    }
}
