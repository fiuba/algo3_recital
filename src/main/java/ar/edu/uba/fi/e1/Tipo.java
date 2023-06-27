package ar.edu.uba.fi.e1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Tipo {
    private final ArrayList<MedioPago> mediosDePagos;
    private int precio;

    public Tipo(int precio, MedioPago ... mediosDePago) {
        this.precio = precio;
        this.mediosDePagos = new ArrayList<>(Arrays.asList(mediosDePago));
    }
    public Entrada obtenerEntradaPara(Tipo tipo, MedioPago medioPago) {
        if (this.equals(tipo)) {
            MedioPago aUtilizar = soporta(medioPago);

            return aUtilizar.crear(this.precio, tipo);
        }
        return null;
    }

    private MedioPago soporta(MedioPago medioPago) {
        return this.mediosDePagos.stream()
                .filter((mp) -> mp.equals(medioPago))
                .findFirst()
                .orElse(new Ninguno());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tipo tipo1 = (Tipo) o;
        return Objects.equals(mediosDePagos, tipo1.mediosDePagos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediosDePagos);
    }
}
