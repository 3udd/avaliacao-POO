package ex3;

public class Aprovacao {
    public static ex2.Estudante[] aprovados (ex2.Estudante[] turma) {
        int quant=0;

        for (ex2.Estudante estudante : turma) {
            if (estudante.calculaMedia() >= 6.0) {
                quant++;
            }
        }

        if (quant == 0) {
            return null;
        }
    }
}
