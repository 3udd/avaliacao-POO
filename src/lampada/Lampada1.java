package lampada;

public class Lampada1 {
    private boolean acesa;

    public Lampada1(boolean estadoInicial) {
        this.acesa = estadoInicial;
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
        Lampada1 lamp = new Lampada1(false);

        lamp.exibirEstado();

        System.out.println("\n");

        lamp.interruptor();
        lamp.exibirEstado();

        System.out.println("\n");

        lamp.interruptor();
        lamp.exibirEstado();
    }
}