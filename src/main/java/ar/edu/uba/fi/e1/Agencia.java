package ar.edu.uba.fi.e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Agencia {
    private final ArrayList<Tipo> disponibilidad;

    public Agencia() {
        disponibilidad = new ArrayList<>();

        disponibilidad.add(new TipoA());
        disponibilidad.add(new TipoB());
    }

    public List<Entrada> comprar(Pedido... pedidos) {
        ArrayList resultados = new ArrayList();

        for(Pedido p : pedidos) {
            List<Entrada> entradas = p.completar(disponibilidad);

            for(Entrada e : entradas) {
                resultados.add(e);
            }

        }
        return filtrarEntradasNulas(resultados);
    }

    private static List<Entrada> filtrarEntradasNulas(ArrayList resultados) {
        return (List<Entrada>) resultados.parallelStream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

}
