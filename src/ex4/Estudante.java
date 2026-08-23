package ex4;
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
            System.out.println("Digite a " + (slave+1) + "ª nota do estudante " + this.nome + ": ");
            this.notas[slave] = scanner.nextDouble();
        }
    }

    public double calculaMedia() {
        double soma=0;

        for (double nota : this.notas) {
            soma = soma + nota;
        }
        return soma / this.notas.length;
    }

    public String getNome() {
        return this.nome;
    }
    public double[] getNotas() {
        return this.notas;
    }

    public double menorNota() {
        double menor = this.notas[0];
        int slave;

        for (slave = 0; slave < 5; slave++) {
            if (this.notas[slave] < menor) {
                menor = this.notas[slave];
            }
        }
        return menor;
    }
}
