package trzecialekcja;

public class zad12 {
    public static void main(String[] args) {
        double suma = 0;
        int i;


        for(i = 0 ; i <=30; i++) {
         suma +=(double)i/(31 -i);
        }
        System.out.println("suma wynosi: "+ suma);
    }
}
