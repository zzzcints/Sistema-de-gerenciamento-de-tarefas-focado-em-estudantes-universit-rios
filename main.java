import java.util.Scanner;


public class Main{


       public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         Sistema sistema = new Sistema();

        System.out.print("Nome da disciplina: ");
        String nome = sc.nextLine();
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        Usuario usuario = new Usuario(nome);
        sistema.cadastrarUsuario(usuario);

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
            int opcao = sc.nextInt();
            sc.nextLine(); 

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
                    for (Disciplina disc : sistema.disciplinas) {
                        if (disc.getNome().equalsIgnoreCase(discTarefa)) {
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



