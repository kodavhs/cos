package trzecialekcja;

import java.util.Scanner;

public class zadanie7
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę pięter w hotelu (większą niż 0): ");
        int floors = scanner.nextInt();
        while (floors < 1) {
            System.out.print("Podaj liczbę pięter w hotelu (większą niż 0): ");
            floors = scanner.nextInt();
        }

        int totalRooms = 0;
        int totalOccupiedRooms = 0;

        for (int i = 1; i <= floors; i++) {
            System.out.println("Piętro " + i);
            System.out.print("Podaj liczbę wszystkich pokojów: ");
            int allRooms = scanner.nextInt();
            while (allRooms < 10) {
                System.out.print("Podaj liczbę wszystkich pokojów (większą niż 9): ");
                allRooms = scanner.nextInt();
            }

            System.out.print("Podaj liczbę zajętych pokojów: ");
            int occupiedRooms = scanner.nextInt();

            totalRooms += allRooms;
            totalOccupiedRooms += occupiedRooms;

            double occupancyRate = (double) occupiedRooms / allRooms;
            System.out.println("Poziom obłożenia dla tego piętra: " + occupancyRate * 100 + "%\n");
        }

        int emptyRooms = totalRooms - totalOccupiedRooms;
        double totalOccupancyRate = (double) totalOccupiedRooms / totalRooms;
        System.out.println("Łączna liczba pokojów w hotelu: " + totalRooms);
        System.out.println("Liczba zajętych pokojów: " + totalOccupiedRooms);
        System.out.println("Liczba pustych pokojów: " + emptyRooms);
        System.out.println("Średni poziom obłożenia dla całego hotelu: " + totalOccupancyRate * 100 + "%");

        scanner.close();
    }
}

