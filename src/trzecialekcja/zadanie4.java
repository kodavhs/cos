package trzecialekcja;
import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysWorked;

        // Pobieranie liczby dni pracy, dopóki użytkownik nie poda wartości większej niż 0
        do {
            System.out.print("Podaj liczbę przepracowanych dni (większą niż 0): ");
            daysWorked = scanner.nextInt();
        } while (daysWorked < 1);

        // Inicjalizacja zmiennych
        double totalPayment = 0;
        double dailyPayment = 0.01;

        // Wyświetlanie tabeli z wynagrodzeniem za każdy dzień
        System.out.println("Dzień\t\tWynagrodzenie");
        System.out.println("-----------------------------");
        for (int i = 1; i <= daysWorked; i++) {
            System.out.printf("%d\t\t%.2f zł\n", i, dailyPayment);
            totalPayment += dailyPayment;
            dailyPayment *= 2; // Podwajanie wynagrodzenia każdego kolejnego dnia
        }

        // Wyświetlanie sumarycznej zapłaty za cały okres
        System.out.printf("\nSumaryczna zapłata za %d dni: %.2f zł\n", daysWorked, totalPayment);

        scanner.close();
    }
}
