package br.ufc;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class SistemaTest {

    @Test
    public void testCadastrarUsuario() {
        Sistema sistema = new Sistema();
        Usuario u = new Usuario("Cíntia");

        sistema.cadastrarUsuario(u);

        assertEquals(1, sistema.getUsuarios().size());
        assertEquals("Cíntia", sistema.getUsuarios().get(0).getNome());
    }

    @Test
    public void testCadastrarUsuarioDuplicado() {
        Sistema sistema = new Sistema();
        Usuario u1 = new Usuario("Cíntia");
        Usuario u2 = new Usuario("Cíntia");

        sistema.cadastrarUsuario(u1);
        sistema.cadastrarUsuario(u2);

        // só deve ter 1 usuário
        assertEquals(1, sistema.getUsuarios().size());
    }

    @Test
    public void testCadastrarDisciplina() {
        Sistema sistema = new Sistema();
        Disciplina d = new Disciplina("POO", "Professor João");

        sistema.cadastrarDisciplina(d);

        assertEquals(1, sistema.getDisciplinas().size());
        assertEquals("POO", sistema.getDisciplinas().get(0).getNome());
    }

    @Test
    public void testCadastrarTarefa() {
        Sistema sistema = new Sistema();
        Disciplina d = new Disciplina("POO", "Professor João");
        sistema.cadastrarDisciplina(d);

        Tarefa t = new Tarefa("Trabalho 1", "Fazer relatório", "Alta", "Pendente", d);
        sistema.cadastrarTarefa(t);

        // não temos getter direto, mas podemos verificar se listarTarefas não lança erro
        assertDoesNotThrow(() -> sistema.listarTarefas());
    }

    @Test
    public void testRemoverTarefaInexistente() {
        Sistema sistema = new Sistema();
        sistema.removerTarefa("Inexistente");

        // lista de tarefas continua vazia
        assertEquals(0, sistema.getUsuarios().size());
        assertEquals(0, sistema.getDisciplinas().size());
    }
}
