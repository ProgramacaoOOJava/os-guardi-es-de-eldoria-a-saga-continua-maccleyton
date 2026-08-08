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
        }
        System.out.println("----------------------------------------------");

    }
}
