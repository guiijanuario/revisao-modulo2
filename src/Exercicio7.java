import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite um número inteiro ");
        int numero = scanner.nextInt();

        for (int i = 0; i < numero; i++){
            System.out.println(nome);
        }
    }
}
