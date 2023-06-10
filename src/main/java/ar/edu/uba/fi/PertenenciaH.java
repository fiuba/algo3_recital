package ar.edu.uba.fi;

public class PertenenciaH implements MedioPago{

    @Override
    public boolean equals(Object other) {

        return this.getClass().equals(other.getClass());
    }

    @Override
    public Entreda crear(int gasto, Tipo tipo) {

        return new Entreda(tipo);
    }
}
