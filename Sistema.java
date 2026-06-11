import java.util.ArrayList;


public class Sistema {
    private ArrayList<Tarefa> tarefas;
    private ArrayList<Disciplina> disciplinas;

    public Sistema(){
        tarefas = new ArrayList<>();
        disciplinas = new ArrayList<>();
    }

    public void cadastrarDisciplina(Disciplina d){
        disciplinas.add(d);

    }

    public void cadastrarTarefa(Tarefa t){
        tarefas.add(t);

    }

    public void listarTarefas(){

        for(Tarefa t : tarefas){
            t.exibir();
        }
    }

    public void buscarTarefa(String titulo){
        for(Tarefa t : tarefas){
            if(t.getTitulo().equalsIgnoreCase(titulo)){
                t.exibir();
                return;
            }
        }
        System.out.println("Tarefa nao encontrada.");

    }

    public void removerTarefa(){
        for(Tarefa t: tarefas){
            if(t.getTitulo().equalsIgnore(titulo)){
                tarefas.remove(t);
                System.ou.println("Tarefa removida");
                return;
            }
        }
    }

     public void relatorioAtividades() {

        System.out.println("RELATÓRIO DE ATIVIDADES");

        for (Tarefa t : tarefas) {
            t.exibir();
        }
    }

       public void relatorioDisciplinas() {

        System.out.println("AGENDA DAS DISCIPLINAS");

        for (Disciplina d : disciplinas) {
            System.out.println(d.getNome());
        }
    }
}



