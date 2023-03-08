import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double graos = 0;
        double casas = 0;
        double multiplicador =1;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite quantas casas do tabuleiro serão usadas");
        casas = s.nextInt();
        for (double i =1; i<=casas; i++) {
            graos = graos + multiplicador;
            multiplicador = multiplicador * 2;
            //System.out.println("O número de grãos é " +graos);
        }
        System.out.println("O número de grãos é " +graos);
    }
}