package ar.edu.uba.fi;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int cantidad;
    private Tipo tipoBuscado;
    private MedioPago medioDePago;

    public Pedido(int cantidad, Tipo tipo, MedioPago medioPago) {
        this.cantidad = cantidad;
        this.tipoBuscado = tipo;
        this.medioDePago = medioPago;
    }

    public List<Entreda> completar(ArrayList<Tipo> disponibilidad) {
        ArrayList resultados = new ArrayList();

        for (int i = 0; i < this.cantidad; ++i) {
            for (Tipo t : disponibilidad) {
                resultados.add(t.obtenerEntradaPara(this.tipoBuscado, this.medioDePago));
            }
        }

        return resultados;
    }
}
