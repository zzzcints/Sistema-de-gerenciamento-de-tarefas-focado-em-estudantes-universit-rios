package br.ufc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class UsuarioTest {

    @Test
    public void testCriarUsuario() {
        Usuario u = new Usuario("Cíntia");

        assertEquals("Cíntia", u.getNome());
    }

    @Test
    public void testCriarOutroUsuario() {
        Usuario u = new Usuario("João");

        assertEquals("João", u.getNome());
    }
}
