import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formata = new DecimalFormat("0.00");

        System.out.println("Digite o número de identificação do aluno");
        int idAluno = scanner.nextInt();

        System.out.println("Agora digite a 1ª nota do aluno:");
        double nota1 = scanner.nextDouble();

        System.out.println("Agora digite a 2ª nota do aluno:");
        double nota2 = scanner.nextDouble();

        System.out.println("Agora digite a 3ª nota do aluno:");
        double nota3 = scanner.nextDouble();

        double mediaAluno = (nota1 + nota2 + nota3) / 3;

        double MediaAproveitamento = (((nota1 + (nota2 * 2) + (nota3 * 3))) + mediaAluno)/7;

        System.out.println("O número do aluno é: " + formata.format(idAluno));
        System.out.println("Sua primeira nova é: " + formata.format(nota1));
        System.out.println("Sua segunda nova é: " + formata.format(nota2));
        System.out.println("Sua terceira nova é: " + formata.format(nota3));
        System.out.println("A média do aluno é: " + formata.format(mediaAluno));
        System.out.println("A média de aproveitamento do aluno é: " + formata.format(MediaAproveitamento));

        if (MediaAproveitamento >= 90) {
            System.out.println("Conceito A - Parabéns, Aprovado!!");
        } else if (MediaAproveitamento >= 75 &&  MediaAproveitamento < 90) {
            System.out.println("Conceito B - Parabéns, Aprovado!!");
        } else if (MediaAproveitamento >= 60 && MediaAproveitamento < 75){
            System.out.println("Conceito C - Parabéns, Aprovado!!");
        } else if (MediaAproveitamento >= 40 && MediaAproveitamento < 60) {
            System.out.println("Conceito D - Infelizmente Reprovado!!");
        } else {
            System.out.println("Conceito E - Infelizmente Reprovado!!");
        }
    }
}
