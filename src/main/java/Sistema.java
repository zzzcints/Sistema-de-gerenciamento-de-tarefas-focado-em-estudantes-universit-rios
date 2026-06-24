package br.ufc;
import java.io.*;
import java.util.ArrayList;

public class Sistema implements Gerenciavel {
    private ArrayList<Tarefa> tarefas;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Usuario> usuarios;

    public Sistema(){
        tarefas = new ArrayList<>();
        disciplinas = new ArrayList<>();
        usuarios = new ArrayList<>();
        carregarUsuarios();
        carregarDisciplinas();
        carregarTarefas();
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
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


    // Usuarios



    public void cadastrarUsuario(Usuario u){
        for (Usuario existente : usuarios) {
            if (existente.getNome().equalsIgnoreCase(u.getNome())) {
                System.out.println("Erro: usuário '" + u.getNome() + "' já existe!");
                return;
            }
        }
        usuarios.add(u);
        salvarUsuarios();
        System.out.println("Usuário cadastrado: " + u.getNome());
    }

    private void salvarUsuarios() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("usuarios.txt"))) {
            for (Usuario u : usuarios) {
                bw.write(u.getNome());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar usuários.");
        }
    }

    private void carregarUsuarios() {
        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                usuarios.add(new Usuario(linha));
            }
        } catch (IOException e) {
        }
    }


    // Disciplina



    public void cadastrarDisciplina(Disciplina d){
        disciplinas.add(d);
        salvarDisciplinas();
        System.out.println("Disciplina cadastrada: " + d.getNome());
    }

    private void salvarDisciplinas() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("disciplinas.txt"))) {
            for (Disciplina d : disciplinas) {
                bw.write(d.getNome() + ";" + d.getProfessor());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar disciplinas.");
        }
    }

    private void carregarDisciplinas() {
        try (BufferedReader br = new BufferedReader(new FileReader("disciplinas.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 2) {
                    disciplinas.add(new Disciplina(partes[0], partes[1]));
                }
            }
        } catch (IOException e) {
        }
    }



    // Tarefas:


    public void cadastrarTarefa(Tarefa t){
        tarefas.add(t);
        salvarTarefas();
        System.out.println("Tarefa cadastrada: "+ t.getNomeTarefa());
    }

    private void salvarTarefas() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("tarefas.txt"))) {
            for (Tarefa t : tarefas) {
                bw.write(t.getNomeTarefa() + ";" + t.getDescricao() + ";" + t.getPrioridade() + ";" + t.getStatus() + ";" + t.getDisciplina().getNome());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar tarefas.");
        }
    }

    private void carregarTarefas() {
        try (BufferedReader br = new BufferedReader(new FileReader("tarefas.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 5) {
                    Disciplina disciplinaEncontrada = null;
                    for (Disciplina d : disciplinas) {
                        if (d.getNome().equalsIgnoreCase(partes[4])) {
                            disciplinaEncontrada = d;
                            break;
                        }
                    }
                    if (disciplinaEncontrada != null) {
                        tarefas.add(new Tarefa(partes[0], partes[1], partes[2], partes[3], disciplinaEncontrada));
                    }
                }
            }
        } catch (IOException e) {
        }
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
                    salvarTarefas();
                    System.out.println("Tarefa removida");
                    return;
                }
            }
            throw new Exception("Tarefa não encontrada.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // Relatiorios

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
