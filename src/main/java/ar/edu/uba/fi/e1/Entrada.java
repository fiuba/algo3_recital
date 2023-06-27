package ar.edu.uba.fi.e1;

import java.util.Objects;

public class Entrada {
    private Tipo tipo;

    public Entrada(Tipo tipo) {
        this.tipo = tipo;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entrada entrada = (Entrada) o;
        return Objects.equals(tipo, entrada.tipo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tipo);
    }
}
