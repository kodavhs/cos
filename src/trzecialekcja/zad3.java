package trzecialekcja;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String wpis;


        do{

            System.out.println("Wpisz Tak lub Nie");
            wpis = scanner.nextLine();

        }while(!wpis.equals("Tak") && !wpis.equals("Nie"));

        System.out.println("Poprawny wpis");

    }
}
