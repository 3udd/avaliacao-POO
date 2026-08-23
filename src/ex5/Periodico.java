package ex5;

public class Periodico extends Publicacao {
    private int volume;

    public Periodico(String titulo, int volume) {
        super(titulo);
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }
}
