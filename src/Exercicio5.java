import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numerosEntre = new ArrayList<>();

        int numerosEntres = 0;
        for (int i = 0; i < 20; i++){
            System.out.println("Insira o " + ( i + 1 ) + "ª" + " número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);

            if(numero <= 100 && numero >= 0){
                numerosEntres++;
                numerosEntre.add(numero);
            }
        }

        System.out.println("Entre os números digitados: " + numerosEntres + " estão entre 0 e 100, os seguintes números " + numerosEntre);
        System.out.println("Os números inseridos foram: " + numeros);
    }
}
