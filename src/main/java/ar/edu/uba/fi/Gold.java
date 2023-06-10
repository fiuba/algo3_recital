package ar.edu.uba.fi;

public class Gold implements MedioPago {

    private final int limite;
    private int gastosAcumulados;

    public Gold() {
        this.limite = 1000;
        this.gastosAcumulados = 0;
    }

    @Override
    public boolean equals(Object other) {
        return this.getClass().equals(other.getClass());
    }

    @Override
    public Entreda crear(int gasto, Tipo tipo) {
        this.gastosAcumulados = this.gastosAcumulados + gasto;

        if ( this.gastosAcumulados <= this.limite) {
            return new Entreda(tipo);
        }

        return null;
    }
}
