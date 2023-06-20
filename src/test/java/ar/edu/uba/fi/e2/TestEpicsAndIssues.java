package ar.edu.uba.fi.e2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEpicsAndIssues {

    @Test
    public void promoteIssue() {
        Epica e = new Epica("Titulo épica");
        Item i = e.agregarIssue("Titulo issue");

        i.promote();

        Epica esperada = new Epica("Titulo épica");
        esperada.agregarEpica("Titulo issue");
        assertEquals(e, esperada);
    }
}
