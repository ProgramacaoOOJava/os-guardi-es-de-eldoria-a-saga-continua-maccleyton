package eldoria;

/**
 * Classe que representa um Guerreiro no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de combate.
 */
public class Guerreiro extends Personagem {
    private double forca;
     // * Construtor para criar um Guerreiro.
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase, double forca) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        this.forca = forca;
    }

    // Exibir status atualizado
    @Override
    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + getNome() );
        System.out.println("Classe: " + getClasse() );
        System.out.println("Nível: " + getNivel() );
        System.out.println("Pontos de Vida: " + getPontosDeVida() );
        System.out.println("Poder Base: " + getPoderBase() );
        System.out.println("Força: " + forca );
        System.out.println(); // Linha em branco
    }

    /**
     * Sobrescrita do método usarHabilidade() específica para Guerreiros.
     * Demonstra polimorfismo e vinculação dinâmica.
     */
    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " ataca com: Espada Flamejante!");
    }

}

