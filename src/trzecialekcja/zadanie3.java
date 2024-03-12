package trzecialekcja;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed;
        double hours;

        try {
            FileWriter writer = new FileWriter("odleglosci.txt");

            do {
                System.out.println("podaj szybkosc pojazdu w km/h: ");
                speed = scanner.nextDouble();
            } while (speed < 0);
            do {
                System.out.println("podaj liczbę godzin podróży:");
                hours = scanner.nextDouble();
            } while (hours <= 0);

            double distance;
            for (int i = 1; i <= hours; i++) {
                distance = speed * i;
                writer.write("godzina: " + i + ", przebyta odleglosc: " + distance + " km.\n");
            }

            writer.close();
            System.out.println("Dane zostały zapisane do pliku odleglosci.txt");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisywania danych do pliku.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

