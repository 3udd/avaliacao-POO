package F1;

public class TesteCarro {
    public static void main(String[] args) {
        Patrocinador petrobras = new Patrocinador("Petrobras", 50000000.00);
        Patrocinador shell = new Patrocinador("Shell", 75000000.00);
        Patrocinador redBull = new Patrocinador("Red Bull", 100000000.00);
        Patrocinador mercedes = new Patrocinador("Mercedes-Benz", 120000000.00);
        Patrocinador santander = new Patrocinador("Santander", 45000000.00);
        Patrocinador pirelli = new Patrocinador("Pirelli", 60000000.00);

        Equipe ferrari = new Equipe("Scuderia Ferrari", 1950);
        ferrari.adicionarPatrocinador(shell);
        ferrari.adicionarPatrocinador(santander);
        ferrari.adicionarPatrocinador(pirelli);

        Equipe redBullRacing = new Equipe("Red Bull Racing", 2005);
        redBullRacing.adicionarPatrocinador(redBull);
        redBullRacing.adicionarPatrocinador(petrobras);

        Equipe mercedesF1 = new Equipe("Mercedes-AMG Petronas", 2010);
        mercedesF1.adicionarPatrocinador(mercedes);
        mercedesF1.adicionarPatrocinador(petrobras);
        mercedesF1.adicionarPatrocinador(pirelli);

        Piloto lewisHamilton = new Piloto("Lewis Hamilton", 38, "Britânico");
        Piloto maxVerstappen = new Piloto("Max Verstappen", 26, "Holandês");
        Piloto charlesLeclerc = new Piloto("Charles Leclerc", 26, "Monegasco");

        Carro carroMercedes = new Carro(44, 1, mercedesF1, lewisHamilton);
        Carro carroRedBull = new Carro(1, 2, redBullRacing, maxVerstappen);
        Carro carroFerrari = new Carro(16, 3, ferrari, charlesLeclerc);

        System.out.println("=== CAMPEONATO DE FÓRMULA 1 ===\n");

        System.out.println(carroMercedes);
        System.out.println("\n" + "=".repeat(50) + "\n");

        System.out.println(carroRedBull);
        System.out.println("\n" + "=".repeat(50) + "\n");

        System.out.println(carroFerrari);

        System.out.println("\n" + "=".repeat(50));
        System.out.println("=== RESUMO DO CAMPEONATO ===");
        System.out.println("Pole Position: " + carroMercedes.getPiloto().getNome() +
                " (Carro #" + carroMercedes.getNumero() + ")");
        System.out.println("Grid de Largada:");
        System.out.println("1º: " + carroMercedes.getPiloto().getNome());
        System.out.println("2º: " + carroRedBull.getPiloto().getNome());
        System.out.println("3º: " + carroFerrari.getPiloto().getNome());
    }
}