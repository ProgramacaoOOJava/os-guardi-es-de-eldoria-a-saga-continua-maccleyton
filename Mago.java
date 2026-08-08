package eldoria;

/**
 * Classe que representa um Mago no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de magia.
 */
public class Mago extends Personagem {
    private double inteligencia;
    
    // * Construtor para criar um Mago.
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase, double inteligencia) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.inteligencia = inteligencia;
    }

    // Exibir status atualizado
    @Override
    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Classe: " + getClasse());
        System.out.println("Nível: " + getNivel());
        System.out.println("Pontos de Vida: " + getPontosDeVida());
        System.out.println("Poder Base: " + getPoderBase());
        System.out.println("Inteligência: " + inteligencia);
        System.out.println(); // Linha em branco
    }

    /**
     * Sobrescrita do método usarHabilidade() específica para Magos.
     * Demonstra polimorfismo e vinculação dinâmica.
     */
    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " lança: Bola de Fogo!");
    }

}

