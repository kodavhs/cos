package trzecialekcja;

import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę lat: ");
        int years = scanner.nextInt();
        while (years < 1) {
            System.out.print("Podaj liczbę lat (większą niż 0): ");
            years = scanner.nextInt();
        }

        int totalRainfall = 0;
        int totalMonths = years * 12;

        for (int i = 1; i <= years; i++) {
            System.out.println("Rok " + i + ":");
            for (int j = 1; j <= 12; j++) {
                System.out.print("Podaj liczbę centymetrów opadów w miesiącu " + j + ": ");
                int rainfall = scanner.nextInt();
                while (rainfall < 0) {
                    System.out.print("Podaj liczbę centymetrów opadów (nieujemną) w miesiącu " + j + ": ");
                    rainfall = scanner.nextInt();
                }
                totalRainfall += rainfall;
            }
        }

        double averageRainfall = (double) totalRainfall / totalMonths;

        System.out.println("Łączna liczba miesięcy: " + totalMonths);
        System.out.println("Łączna liczba centymetrów opadów: " + totalRainfall);
        System.out.println("Średni poziom opadów: " + averageRainfall + " cm");

        scanner.close();
    }
}
