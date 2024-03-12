package trzecialekcja;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Wprowadź liczbe z przedziału od 10 do 24:");
            number = scanner.nextInt();

        } while (number <10 || number > 24);
            System.out.println("Poprawna liczba");

    }
}
