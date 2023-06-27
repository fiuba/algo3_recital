package ar.edu.uba.fi.e1;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int cantidad;
    private TipoEntrada tipoBuscado;
    private MedioPago medioDePago;

    public Pedido(int cantidad, TipoEntrada tipo, MedioPago medioPago) {
        this.cantidad = cantidad;
        this.tipoBuscado = tipo;
        this.medioDePago = medioPago;
    }

    public List<Entrada> completar(ArrayList<TipoEntrada> disponibilidad) {
        ArrayList resultados = new ArrayList();

        for (int i = 0; i < this.cantidad; ++i) {
            for (TipoEntrada t : disponibilidad) {
                resultados.add(t.obtenerEntradaPara(this.tipoBuscado, this.medioDePago));
            }
        }

        return resultados;
    }
}
