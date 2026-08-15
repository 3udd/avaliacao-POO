package F1;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private int anoFundacao;
    private List<Patrocinador> patrocinadores;

    public Equipe(String nome, int anoFundacao) {
        this.nome = nome;
        this.anoFundacao = anoFundacao;
        this.patrocinadores = new ArrayList<>();
    }

    public void adicionarPatrocinador(Patrocinador patrocinador) {
        patrocinadores.add(patrocinador);
    }

    public void removerPatrocinador(Patrocinador patrocinador) {
        patrocinadores.remove(patrocinador);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public List<Patrocinador> getPatrocinadores() {
        return patrocinadores;
    }

    public double getTotalPatrocinios() {
        double total = 0;
        for (Patrocinador p : patrocinadores) {
            total += p.getValorPatrocinio();
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipe: ").append(nome).append(" (Fundada em: ").append(anoFundacao).append(")\n");
        sb.append("Patrocinadores:\n");
        for (Patrocinador p : patrocinadores) {
            sb.append("  - ").append(p.toString()).append("\n");
        }
        sb.append("Total de patrocínios: R$ ").append(String.format("%.2f", getTotalPatrocinios()));
        return sb.toString();
    }
}