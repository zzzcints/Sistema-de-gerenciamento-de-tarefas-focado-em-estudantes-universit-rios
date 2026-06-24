package br.ufc;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TarefaTest {

    @Test
    public void testCriarTarefa() {
        Disciplina d = new Disciplina("POO", "Professor João");
        Tarefa t = new Tarefa("Trabalho 1", "Fazer relatório", "Alta", "Pendente", d);

        assertEquals("Trabalho 1", t.getNomeTarefa());
        assertEquals("Fazer relatório", t.getDescricao());
        assertEquals("Alta", t.getPrioridade());
        assertEquals("Pendente", t.getStatus());
        assertEquals("POO", t.getDisciplina().getNome());
    }

    @Test
    public void testCriarOutraTarefa() {
        Disciplina d = new Disciplina("Banco de Dados", "Professora Maria");
        Tarefa t = new Tarefa("Projeto Final", "Implementar sistema", "Média", "Concluída", d);

        assertEquals("Projeto Final", t.getNomeTarefa());
        assertEquals("Implementar sistema", t.getDescricao());
        assertEquals("Média", t.getPrioridade());
        assertEquals("Concluída", t.getStatus());
        assertEquals("Banco de Dados", t.getDisciplina().getNome());
    }

    @Test
    public void testExibirNaoLancaErro() {
        Disciplina d = new Disciplina("POO", "Professor João");
        Tarefa t = new Tarefa("Trabalho 1", "Fazer relatório", "Alta", "Pendente", d);

        // apenas garante que o método roda sem lançar exceção
        assertDoesNotThrow(() -> t.exibir());
    }
}
