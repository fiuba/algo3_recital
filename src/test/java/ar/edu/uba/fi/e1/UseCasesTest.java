package ar.edu.uba.fi.e1;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class UseCasesTest {
    @Test
    public void case_01() {
        Agencia a = new Agencia();

        List<Entrada> compra = a.comprar(new Pedido(2, new TipoB(), new PertenenciaH()));
        ArrayList<Entrada> compraEsperada = new ArrayList<>(
                Arrays.asList(
                        new Entrada( new TipoB()),
                        new Entrada( new TipoB())
                )
        );

        assertEquals(compraEsperada, compra);
    }

    @Test
    public void case_02() {
        Agencia a = new Agencia();

        List<Entrada> compra = a.comprar(new Pedido(2, new TipoA(), new Gold()));
        ArrayList<Entrada> compraEsperada = new ArrayList<>(
                List.of(
                        new Entrada(new TipoA())
                )
        );

        assertEquals(compraEsperada, compra);
    }
    @Test
    public void case_03() {
        Agencia a = new Agencia();

        List<Entrada> compra = a.comprar(
                new Pedido(2, new TipoB(), new PertenenciaH()),
                new Pedido(2, new TipoA(), new PertenenciaH()));
        ArrayList<Entrada> compraEsperada = new ArrayList<>(
                Arrays.asList(
                        new Entrada( new TipoB()),
                        new Entrada( new TipoA()),
                        new Entrada( new TipoA()),
                        new Entrada( new TipoB())
                )
        );

        for (Entrada entrada : compraEsperada) {
            assertTrue(compra.contains(entrada));
            compra.remove(entrada);
        }
    }

    @Test
    public void case_04_GoldCannotBuyTipoB() {
        Agencia a = new Agencia();

        List<Entrada> compra = a.comprar(
                new Pedido(2, new TipoB(), new Gold()));

        assertTrue(compra.isEmpty());
    }
}
