import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat();

        ArrayList<Double> salarios = new ArrayList<>();

        double salario;
        do {
            System.out.printf("Digite um salário (ou -1 para encerrar): ");
            salario = scanner.nextDouble();

            if ( salario != -1){
                salarios.add(salario);
            }

        }while (salario != -1);

        System.out.print("Digite o valor de reajuste: ");
        double reajuste = scanner.nextDouble();

        ArrayList<Double> salariosReajustados = new ArrayList<>();
        for(double salarioAtual : salarios){
            double salarioReajustado = salarioAtual + reajuste;
            salariosReajustados.add(salarioReajustado);
        }

        for (double salarioReajustado : salariosReajustados) {
            System.out.println("Salário reajustado: " + formatador.format(salarioReajustado));
        }

    }
}
