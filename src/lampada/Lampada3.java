package lampada;

public class Lampada3 {
    private boolean acesa;
    private int watts;

    public Lampada3(boolean EstadoInicial, int watts) {
        this.acesa = EstadoInicial;
        setWatts(watts);
    }

    public void setWatts(int watts) {
        if (watts < 1) {
            watts = 1;
        }
        else if (watts > 1000) {
            watts = 1000;
        }
        this.watts = watts;
    }

    public void exibirWatts() {
        System.out.println("A quantidade de watts é: " + watts);
    }

    public void interruptor() {
        acesa = !acesa;
        if (acesa) {
            System.out.println("A lâmpada foi acesa.");
        } else {
            System.out.println("A lâmpada foi apagada.");
        }
    }

    public void exibirEstado() {
        if (acesa) {
            System.out.println("A lâmpada está acesa no momento.");
        } else {
            System.out.println("A lâmpada está apagada no momento.");
        }
    }

    static void main(String[] args) {
        Lampada3 lamp = new Lampada3 (false, -100);

        lamp.exibirEstado();
        lamp.exibirWatts();

        System.out.println("\n");

        lamp.interruptor();
        lamp.exibirEstado();

        System.out.println("\n");

        lamp.interruptor();
        lamp.exibirEstado();
    }
}