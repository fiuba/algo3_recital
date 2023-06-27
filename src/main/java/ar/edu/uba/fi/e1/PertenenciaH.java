package ar.edu.uba.fi.e1;

public class PertenenciaH implements MedioPago{

    @Override
    public boolean equals(Object other) {

        return this.getClass().equals(other.getClass());
    }

    @Override
    public Entrada crear(int gasto, TipoEntrada tipo) {

        return new Entrada(tipo);
    }
}
