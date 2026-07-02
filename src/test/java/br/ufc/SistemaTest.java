package br.ufc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class SistemaTest {

    @Test
    public void testCadastrarDisciplina() {
        Sistema sistema = new Sistema();

        int antes = sistema.getDisciplinas().size();

        Disciplina d = new Disciplina("POO", "Carlos");
        sistema.cadastrarDisciplina(d);

        int depois = sistema.getDisciplinas().size();

        assertEquals(antes + 1, depois);
    }

    @Test
    public void testRemoverTarefaInexistente() {
        Sistema sistema = new Sistema();

        boolean resultado = sistema.removerTarefa(
            new Tarefa("X", "Y", "Alta", "Pendente", new Disciplina("POO", "Carlos"))
        );

        assertFalse(resultado);
    }
}