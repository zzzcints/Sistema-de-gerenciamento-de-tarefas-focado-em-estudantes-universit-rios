package br.ufc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TarefaTest {

    @Test
    public void testCriacaoTarefa() {
        Disciplina d = new Disciplina("POO", "Carlos");

        Tarefa t = new Tarefa(
            "Trabalho 1",
            "Fazer relatório",
            "Alta",
            "Pendente",
            d
        );

        assertEquals("Trabalho 1", t.getNomeTarefa());
        assertEquals("Fazer relatório", t.getDescricao());
        assertEquals("Alta", t.getPrioridade());
        assertEquals("Pendente", t.getStatus());
    }
}