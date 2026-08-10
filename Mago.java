package eldoria;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um Mago no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de magia e auditoria.
 */
public class Mago extends Personagem implements Auditavel {
    private double inteligencia;
    private List<String> acoes;
    
    // * Construtor para criar um Mago.
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase, double inteligencia) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.inteligencia = inteligencia;
        this.acoes = new ArrayList<>();
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

    @Override
    public void registrarAcao(String acao) {
        acoes.add(acao);
    }

    @Override
    public void auditarAcoes() {
        System.out.println("--- Histórico de Ações do Mago " + getNome() + " ---");
        for (String acao : acoes) {
            System.out.println("- " + acao);
        }
    }
}

