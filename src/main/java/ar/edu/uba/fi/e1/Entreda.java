package ar.edu.uba.fi.e1;

import java.util.Objects;

public class Entreda {
    private Tipo tipo;

    public Entreda(Tipo tipo) {
        this.tipo = tipo;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entreda entreda = (Entreda) o;
        return Objects.equals(tipo, entreda.tipo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tipo);
    }
}
