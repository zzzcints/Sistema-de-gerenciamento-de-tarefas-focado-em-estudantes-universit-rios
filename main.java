public class Main{
}


public class Usuario{

    private String nome;
    private String matricula;

    public Usuario(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }
    
    public String getMatricula(){
        return matricula;
    }
}

public class Disciplina{

    private String nome;
    private String professor;

    public Disciplina(String nome, String professor){
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome(){
        return nome;
    }

    
    public String getProfessor(){
        return professor;
    }
}

public class Tarefa{


}

