package trzecialekcja;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed;
        double hours;

        do {
            System.out.println("podaj szybkosc pojazdu w km/h: ");
            speed = scanner.nextDouble();
        }while(speed<0);
        do {
            System.out.println("podaj liczbę godzin podróży:");
            hours = scanner.nextDouble();
        }while(hours<=0);

        double distance;
        for(int i = 1; i<= hours; i++ ){
            distance = speed * i;
            System.out.println("godzina: " + i +", przebyta odleglosc: "+ distance + " km.");

        }
    }
}
