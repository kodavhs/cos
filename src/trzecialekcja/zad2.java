package trzecialekcja;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char letter;
        do{
            System.out.println("podaj litere T t N lub n");
            letter = scanner.next().charAt(0);

        }while(letter != 'T' && letter !='t' && letter != 'N' && letter !='n');
        System.out.println("poprawna literka");
    }
}
