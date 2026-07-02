package br.ufc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    public void testCriarUsuario() {
        Usuario u = new Usuario("Cíntia");

        assertEquals("Cíntia", u.getNome());
    }
}