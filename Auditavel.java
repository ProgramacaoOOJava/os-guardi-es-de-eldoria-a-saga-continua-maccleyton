package eldoria;

/**
 * Interface que define métodos para auditar ações de personagens.
 */
public interface Auditavel {
    void registrarAcao(String acao);
    void auditarAcoes();
}
