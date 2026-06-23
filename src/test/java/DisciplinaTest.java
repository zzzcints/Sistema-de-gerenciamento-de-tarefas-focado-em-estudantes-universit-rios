import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DisciplinaTest {

    @Test
    public void testCriarDisciplina() {
        Disciplina d = new Disciplina("POO", "Professor João");

        assertEquals("POO", d.getNome());
        assertEquals("Professor João", d.getProfessor());
    }

    @Test
    public void testCriarDisciplinaComOutroProfessor() {
        Disciplina d = new Disciplina("Banco de Dados", "Professora Maria");

        assertEquals("Banco de Dados", d.getNome());
        assertEquals("Professora Maria", d.getProfessor());
    }
}
