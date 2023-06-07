import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");

        int somaIdade = 0;
        for (int i = 0; i < 20; i++){
            System.out.println("Insira a " + ( i + 1 ) + "ª" + " idade: ");
            int idade = scanner.nextInt();
            somaIdade += idade;
        }

        double mediaIdade = (double) somaIdade / 20;

        System.out.println("A média das idades é:" + formatador.format(mediaIdade));
    }
}
