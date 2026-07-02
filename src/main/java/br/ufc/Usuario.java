package br.ufc;

public class Usuario extends Pessoa {

    public Usuario(String nome) {
        super(nome);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
    }

}