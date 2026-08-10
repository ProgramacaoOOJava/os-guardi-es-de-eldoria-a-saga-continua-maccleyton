package eldoria;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe principal que demonstra os conceitos de POO aplicados no sistema de personagens de Eldoria.
 * Demonstra: herança, polimorfismo, encapsulamento, instanceof, equals() e hashCode().
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===");
        System.out.println("Os Guardiões se preparam para a batalha!\n");
        
        // Criando uma lista polimórfica de personagens
        List<Personagem> membros = new ArrayList<>();

        // Adicionando Magos à lista
        membros.add(new Mago("Cronos", 10, 200, 500, 200));
        membros.add(new Mago("Merlin", 8, 250, 400, 300));
        // Adicionando Guerreiros à lista
        membros.add(new Guerreiro("Prometeus", 5, 300, 600, 150));
        membros.add(new Guerreiro("Arthur", 9, 350, 550, 350));

        // Percorrendo a lista e demonstrando polimorfismo
        System.out.println("\n--- Membros do Grupo ---");
        for (Personagem personagem : membros) {
            personagem.exibirStatus();
            personagem.usarHabilidade();
            
            // Verificação com instanceof
            if (personagem instanceof Mago) {
                System.out.println("O personagem " + personagem.getNome() + " é um brilhante Mago de nível " + personagem.getNivel() + ".");
                
                // Registrando ação e chamando interface
                Mago mago = (Mago) personagem;
                mago.registrarAcao("Lançou um encanto de proteção elemental.");
                
                Auditavel auditavel = (Auditavel) personagem;
                auditavel.auditarAcoes();
                
            } else if (personagem instanceof Guerreiro) {
                System.out.println("O personagem " + personagem.getNome() + " é um corajoso Guerreiro de nível " + personagem.getNivel() + ".");
            }
            
            // Casting explícito para Personagem e atribuição de benção
            Personagem p = (Personagem) personagem;
            p.atribuirBencao(15.0);
            System.out.println(">> O herói recebeu uma bênção, aumentando seu poder! Status atualizado:");
            p.exibirStatus();
            
            System.out.println("==============================================");
        }

        // Comparando personagens com equals
        System.out.println("\n--- Comparação de Personagens ---");
        Personagem p1 = membros.get(0);
        Personagem p2 = membros.get(1);
        
        System.out.println("Comparando " + p1.getNome() + " com " + p2.getNome() + ":");
        if (p1.equals(p2)) {
            System.out.println("Eles são iguais (mesmo nome e classe).");
        } else {
            System.out.println("Eles são diferentes.");
        }
    }
}
