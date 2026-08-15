package ex2;
import java.util.Scanner;

public class Estudante {
    private String nome;
    private double[] notas;

    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new double[5];
    }

    public void insereNotas() {
        Scanner scanner = new Scanner(System.in);
        int slave;

        for (slave = 0; slave < 5; slave++) {
            System.out.println("Digite a " + slave++ + "ª nota do estudante " + this.nome + ": ");
            this.notas[slave] = scanner.nextDouble();
        }
    }
}
