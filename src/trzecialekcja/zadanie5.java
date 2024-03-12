package trzecialekcja;

import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj łańcuch znaków: ");
        String text = scanner.nextLine();
        System.out.print("Podaj znak, którego wystąpienia chcesz policzyć: ");
        char character = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Liczba wystąpień znaku '" + character + "' w łańcuchu to: " + count);
        scanner.close();
    }
}

