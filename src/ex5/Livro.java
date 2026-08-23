package ex5;

public class Livro extends Publicacao {
    private boolean disponivel;

    public Livro (String titulo) {
        super(titulo);
        this.disponivel = true;
    }

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("Livro '" + getTitulo() + "' emprestado com sucesso");
        }
        else {
            System.out.println("O livro '" + getTitulo() + "' já foi emprestado");
        }
    }
}
