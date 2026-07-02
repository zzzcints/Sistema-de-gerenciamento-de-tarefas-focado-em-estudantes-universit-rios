package br.ufc;
public class Tarefa {
    private String nomeTarefa;   
    private String descricao;
    private String prioridade;
    private String status;
    private Disciplina disciplina;

    public Tarefa(String nomeTarefa, String descricao, String prioridade, String status, Disciplina disciplina) {
        this.nomeTarefa = nomeTarefa;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = status;
        this.disciplina = disciplina;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void exibir() {
        System.out.println("Tarefa: " + nomeTarefa);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prioridade: " + prioridade);
        System.out.println("Status: " + status);
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("-------------------------");
    }
}
