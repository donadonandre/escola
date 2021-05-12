package br.com.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));

        assertThrows(IllegalArgumentException.class, () -> new Email(""));

        assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));
    }
}
