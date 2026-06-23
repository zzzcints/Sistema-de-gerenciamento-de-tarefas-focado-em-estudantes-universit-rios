import java.util.ArrayList;


public class Sistema implements Gerenciavel {
    private ArrayList<Tarefa> tarefas;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Usuario> usuarios;

    public ArrayList<Disciplina> getDisciplinas() {
    return disciplinas;
    }



    public Sistema(){
        tarefas = new ArrayList<>();
        disciplinas = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    @Override
      public void cadastrar() {
        System.out.println("Cadastro realizado.");
    }

    @Override
      public void remover() {
        System.out.println("Remoção realizada.");
    }

     @Override
    public void listar() {
        listarTarefas();
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
        try {
            for(Tarefa t : tarefas){
                if(t.getNomeTarefa().equalsIgnoreCase(titulo)){
                    t.exibir();
                    return;
                }
            }
            throw new Exception("Tarefa não encontrada.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

   public void removerTarefa(String titulo){
        try {
            for(Tarefa t: tarefas){
                if(t.getNomeTarefa().equalsIgnoreCase(titulo)){
                    tarefas.remove(t);
                    System.out.println("Tarefa removida");
                    return;
                }
            }
            throw new Exception("Tarefa não encontrada.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
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



