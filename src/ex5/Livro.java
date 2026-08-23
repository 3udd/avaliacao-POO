package ex5;

public class Livro extends Publicacao {
    private boolean disponivel;

    public Livro (String titulo) {
        super(titulo);
        this.disponivel = true;
    }
}
