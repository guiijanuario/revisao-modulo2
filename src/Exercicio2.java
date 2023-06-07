import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int numero = scanner.nextInt();

        int soma = 0;
        int par = 5;
        int impar = 8;
        if(numero % 2 == 0){
            soma = par + numero;
            System.out.println("O resultado da soma é: " + soma);
            System.out.println("Este número é par");
        } else {
            soma = impar + numero;
            System.out.println("O resultado da soma é: " + soma);
            System.out.println("Este número é impar");
        }

    }
}
