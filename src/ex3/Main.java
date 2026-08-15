package ex3;
import ex2.Estudante;

public class Main {
    static void main(String[] args) {
        ex2.Estudante[] turma = new Estudante[3];
        turma[0] = new Estudante("aluninho 1");
        turma[1] = new Estudante("aluninho 2");
        turma[2] = new Estudante("aluninho 3");

        for (ex2.Estudante estudante : turma) {
            System.out.println("\nNotas de " + estudante.getNome() + "\n");
            estudante.insereNotas();
        }

        Estudante[] aprovados = Aprovacao.aprovados(turma);

        if (aprovados == null) {
            System.out.println("Nenhum aluno passou da média.");
        }
        else {
            System.out.println("Alunos aprovados: ");
            for (Estudante alunoAprovado : aprovados) {
                System.out.println("Nome: " + alunoAprovado.getNome() + ". Média final: " + alunoAprovado.calculaMedia());
            }
        }
    }
}
