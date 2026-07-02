package br.ufc;

/**
 * Interface que define as principais operações do sistema.
 *
 * Obriga a implementação de métodos para cadastro,
 * remoção e gerenciamento de tarefas, disciplinas e usuários.
 */


public interface Gerenciavel {
    void cadastrar();
    void remover();
    void listar();
}
