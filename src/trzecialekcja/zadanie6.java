package trzecialekcja;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę pliku: ");
        String fileName = scanner.nextLine();
        System.out.print("Podaj znak, którego wystąpienia chcesz policzyć: ");
        char character = scanner.next().charAt(0);
        int count = 0;
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == character) {
                        count++;
                    }
                }
            }
            System.out.println("Liczba wystąpień znaku '" + character + "' w pliku '" + fileName + "' to: " + count);
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku o nazwie '" + fileName + "'.");
        }
        scanner.close();
    }
}

