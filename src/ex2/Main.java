package ex2;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do aluno: ");
        String nome = scanner.nextLine();
        Estudante estudante = new Estudante(nome);

        System.out.println("Nome do estudante: " + estudante.getNome());

        estudante.insereNotas();

        double[] notas = estudante.getNotas();
        System.out.println("Notas de " + estudante.getNome() + ": " + Arrays.toString(notas));

        double media = estudante.calculaMedia();
        System.out.println("Média de " + estudante.getNome() + ": " + media);

        double menor = estudante.menorNota();
        System.out.println("Menor nota de " + estudante.getNome() + ": " + menor);
    }
}
