package br.ufc;

/**
 * Representa um usuário do sistema.
 * A classe herda da classe Pessoa.
 *
 * @author Cíntia Dias
 */


public class Usuario extends Pessoa {

    public Usuario(String nome) {
        super(nome);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
    }

}