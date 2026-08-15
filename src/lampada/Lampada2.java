package lampada;

public class Lampada2 {
    private boolean acesa;
    private int watts;

    public Lampada2(int watts) {
        this.watts = watts;
        this.acesa = false; // por padrão, apagada
    }

    public Lampada2() {
        this.watts = 60;
        this.acesa = false;
    }
}