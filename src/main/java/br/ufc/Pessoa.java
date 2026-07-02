package br.ufc;

/**
 * Classe abstrata que representa uma pessoa no sistema.
 * Serve como base para outros tipos de usuários.
 *
 * Contém informações básicas como nome.
 *
 * @author Cíntia
 */

public abstract class Pessoa {
    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public abstract void exibirInfo();
}
