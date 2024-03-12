package trzecialekcja;

import java.util.Scanner;

public class zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        System.out.println("Podaj serię liczb całkowitych (wpisz -99, aby zakończyć): ");
        int number = scanner.nextInt();
        while (number != -99) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            number = scanner.nextInt();
        }


        System.out.println("Największa wartość: " + max);
        System.out.println("Najmniejsza wartość: " + min);

        scanner.close();
    }
}

