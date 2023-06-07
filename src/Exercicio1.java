import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número 1ª inteiro: ");
        int A = scanner.nextInt();
        System.out.println("Insira um número 2ª inteiro: ");
        int B = scanner.nextInt();

        int C = 0;
        if(A == B){
            C = A + B;
            System.out.println("O resultado da soma é: " + C);
        } else {
            C = A * B;
            System.out.println("O resultado da multiplicação é: " + C);
        }
    }
}
