package ar.edu.uba.fi.e1;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class UseCasesTest {
    @Test
    public void case_01() {
        Agencia a = new Agencia();

        List<Entreda> compra = a.comprar(new Pedido(2, new TipoB(), new PertenenciaH()));
        ArrayList<Entreda> compraEsperada = new ArrayList<>(
                Arrays.asList(
                        new Entreda( new TipoB()),
                        new Entreda( new TipoB())
                )
        );

        assertEquals(compraEsperada, compra);
    }

    @Test
    public void case_02() {
        Agencia a = new Agencia();

        List<Entreda> compra = a.comprar(new Pedido(2, new TipoA(), new Gold()));
        ArrayList<Entreda> compraEsperada = new ArrayList<>(
                Arrays.asList(
                        new Entreda( new TipoA())
                )
        );

        assertEquals(compraEsperada, compra);
    }
    @Test
    public void case_03() {
        Agencia a = new Agencia();

        List<Entreda> compra = a.comprar(
                new Pedido(2, new TipoB(), new PertenenciaH()),
                new Pedido(2, new TipoA(), new PertenenciaH()));
        ArrayList<Entreda> compraEsperada = new ArrayList<>(
                Arrays.asList(
                        new Entreda( new TipoB()),
                        new Entreda( new TipoB()),
                        new Entreda( new TipoA()),
                        new Entreda( new TipoA())
                )
        );

        assertEquals(compraEsperada, compra);
    }

}
