package ar.edu.uba.fi;

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

    public List<Entreda> comprar(Pedido... pedidos) {
        ArrayList resultados = new ArrayList();

        for(Pedido p : pedidos) {
            List<Entreda> entradas = p.completar(disponibilidad);

            for(Entreda e : entradas) {
                resultados.add(e);
            }

        }
        return filtrarEntradasNulas(resultados);
    }

    private static List<Entreda> filtrarEntradasNulas(ArrayList resultados) {
        return (List<Entreda>) resultados.parallelStream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

}
