import java.util.ArrayList;


public class Sistema implements Gerenciavel {
    private ArrayList<Tarefa> tarefas;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Usuario> usuarios;


    public Sistema(){
        tarefas = new ArrayList<>();
        disciplinas = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void cadastrarUsuario(Usuario u){
        usuarios.add(u);
        System.out.println("Usuário cadastrado: " + u.getNome());
    }


    public void cadastrarDisciplina(Disciplina d){
        disciplinas.add(d);
        System.out.println("Disciplina cadastrada: " + d.getNome());

    }

    public void cadastrarTarefa(Tarefa t){
        tarefas.add(t);
        System.out.println("Tarefa cadastrada: "+ t.getNomeTarefa());
    }

    public void listarTarefas(){

        for(Tarefa t : tarefas){
            t.exibir();
        }
    }

    public void buscarTarefa(String titulo){
        for(Tarefa t : tarefas){
            if(t.getNomeTarefa().equalsIgnoreCase(titulo)){
                t.exibir();
                return;
            }
        }
        System.out.println("Tarefa nao encontrada.");

    }

    public void removerTarefa(String titulo){
        for(Tarefa t: tarefas){
            if(t.getgetNomeTarefa().equalsIgnore(titulo)){
                tarefas.remove(t);
                System.ou.println("Tarefa removida");
                return;
            }
        }
    }

     public void relatorioAtividades() {

        System.out.println("RELATÓRIO DE ATIVIDADES");
        listarTarefas();
      
    }

       public void relatorioDisciplinas() {

        System.out.println("AGENDA DAS DISCIPLINAS");

        for (Disciplina d : disciplinas) {
            System.out.println(d.getNome() + " - Professor: " + d.getProfessor());
        }
    }
}



