public class Tarefa {


    
    private String nome_tarefa;
    private String descricao;
    private String prioridade;
    private String status;
    private Disciplina disciplina;

    public Tarefa(  
        String nome_tarefa,
        String descricao,
        String prioridade,
        String status;
        String disciplina
    ){
        this.nome_tarefa = nome_tarefa;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = status;
        this.disciplina = disciplina;
    }


    public String get nome_tarefa(){
        return nome_tarefa;
    }
    public String getStatus(){
        return status;
    }
    public String getPrioridade(){
        return prioridade;
    }
    public Disciplina getDisciplina(){
        return disciplina;
    }

    
}
