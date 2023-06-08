public class Exercicio9 {
    public static void main(String[] args) {
        int[] vetor = new int[50];

        int x = 0;
        for (int i = 101; i <=150; i++){
            vetor[x] = i;
            x++;
        }
        System.out.println();
        System.out.println("    Tabela do vetor    ");
        System.out.println("----------------------");
        System.out.println("|  Index  |  Valor   |");
        for (int i = 0; i< vetor.length; i++){
            System.out.printf("|  %3d    |  %5d   |%n", i, vetor[i]);
        }
        System.out.println("----------------------");
    }
}
