package trzecialekcja;

public class zad14 {
    public static void main(String[] args) {

        int rows = 6;

        for(int i = 1; i<=rows; i++){
            System.out.print("#");
            for(int j = 1; j<=i; j++){
                if (j == i){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
