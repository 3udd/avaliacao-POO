package F1;

public class Carro {
    private int numero;
    private int posicao;
    private Equipe equipe;
    private Piloto piloto;

    public Carro(int numero, int posicao, Equipe equipe, Piloto piloto) {
        this.numero = numero;
        this.posicao = posicao;
        this.equipe = equipe;
        this.piloto = piloto;
    }

    public int getNumero() {return numero;}
    public int getPosicao() {return posicao;}
    public Equipe getEquipe() {return equipe;}
    public Piloto getPiloto() {return piloto;}

    public void setNumero(int numero) {this.numero = numero;}
    public void setPosicao(int posicao) {this.posicao = posicao;}
    public void setEquipe(Equipe equipe) {this.equipe = equipe;}
    public void setPiloto(Piloto piloto) {this.piloto = piloto;}

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== CARRO DE FÓRMULA 1 ===\n");
        sb.append("Número: ").append(numero).append("\n");
        sb.append("Posição: ").append(posicao).append("º\n");
        sb.append("Piloto: ").append(piloto).append("\n");
        sb.append("Equipe: ").append(equipe.getNome()).append("\n");
        sb.append("Detalhes da Equipe:\n");
        sb.append(equipe.toString());
        return sb.toString();
    }

}
