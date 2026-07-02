package br.ufc;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe principal do sistema.
 *
 * Responsável por iniciar a aplicação e exibir o menu
 * interativo para o usuário.
 */



public class Main{


       public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         Sistema sistema = new Sistema();

      System.out.println("Bem-vindo ao Sistema de Gerenciamento de Tarefas!");
      System.out.println("1 - Login");
      System.out.println("2 - Cadastrar novo usuário");
      System.out.print("Escolha: ");

      int escolhaLogin = -1;
      try {
        escolhaLogin = sc.nextInt();
        sc.nextLine(); 
     } catch (InputMismatchException e) {
        System.out.println("Erro: digite apenas números!");
        sc.nextLine();
     }

     Usuario usuario = null;

    if (escolhaLogin == 1) {
         System.out.print("Digite seu nome de usuário: ");
         String nomeLogin = sc.nextLine();
         for (Usuario u : sistema.getUsuarios()) {
    if (u.getNome().equalsIgnoreCase(nomeLogin)) {
            usuario = u;
            break;
        }
    }
    if (usuario == null) {
        System.out.println("Usuário não encontrado. Cadastre-se primeiro.");
        return; 
    } else {
        System.out.println("Login realizado com sucesso! Bem-vindo, " + usuario.getNome());
    }
    } else if (escolhaLogin == 2) {
    System.out.print("Digite o seu nome: ");
    String nomeNovo = sc.nextLine();
    usuario = new Usuario(nomeNovo);
    sistema.cadastrarUsuario(usuario);
    } else {
    System.out.println("Opção inválida.");
    return;
}


        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1 - Cadastrar disciplina");
            System.out.println("2 - Cadastrar tarefa");
            System.out.println("3 - Listar tarefas");
            System.out.println("4 - Buscar tarefa");
            System.out.println("5 - Remover tarefa");
            System.out.println("6 - Relatório de atividades");
            System.out.println("7 - Relatório de disciplinas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            
            int opcao = -1; 
            try {
                opcao = sc.nextInt();
                sc.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.println("Erro: digite apenas números!");
                sc.nextLine(); 
                continue;      
            }

            switch (opcao) {
                case 1:
                    System.out.print("Nome da disciplina: ");
                    String nomeDisc = sc.nextLine();
                    System.out.print("Nome do professor: ");
                    String prof = sc.nextLine();
                    Disciplina d = new Disciplina(nomeDisc, prof);
                    sistema.cadastrarDisciplina(d);
                    break;
                case 2:
                    System.out.print("Nome da tarefa: ");
                    String nomeTarefa = sc.nextLine();
                    System.out.print("Descrição: ");
                    String desc = sc.nextLine();
                    System.out.print("Prioridade: ");
                    String prioridade = sc.nextLine();
                    System.out.print("Status: ");
                    String status = sc.nextLine();
                    System.out.print("Disciplina da tarefa: ");
                    String discTarefa = sc.nextLine();
                    Disciplina disciplinaEncontrada = null;
                    for (Disciplina disc : sistema.getDisciplinas()) {                        if (disc.getNome().equalsIgnoreCase(discTarefa)) {
                            disciplinaEncontrada = disc;
                            break;
                        }
                    }
                    if (disciplinaEncontrada != null) {
                        Tarefa t = new Tarefa(nomeTarefa, desc, prioridade, status, disciplinaEncontrada);
                        sistema.cadastrarTarefa(t);
                    } else {
                        System.out.println("Disciplina não encontrada. Cadastre primeiro.");
                    }
                    break;
                case 3:
                    sistema.listarTarefas();
                    break;
                case 4:
                    System.out.print("Digite o título da tarefa: ");
                    String tituloBusca = sc.nextLine();
                    sistema.buscarTarefa(tituloBusca);
                    break;
                case 5:
                    System.out.print("Digite o título da tarefa: ");
                    String tituloRemover = sc.nextLine();
                    sistema.removerTarefa(tituloRemover);
                    break;
                case 6:
                    sistema.relatorioAtividades();
                    break;
                case 7:
                    sistema.relatorioDisciplinas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    
}

}