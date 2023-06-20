package ar.edu.uba.fi.e2;

import java.util.ArrayList;
import java.util.Objects;

public class Epica implements Role {
    private final ArrayList<Item> items;
    private String titulo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Epica epica = (Epica) o;
        return Objects.equals(items, epica.items) && Objects.equals(titulo, epica.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, titulo);
    }

    public Epica(String titulo) {
        this.titulo = titulo;

        this.items = new ArrayList<>();
    }

    public Item agregarIssue(String titulo) {
        Item result = new Item(new Issue(titulo));
        this.items.add(result);
        return result;
    }

    public Item agregarEpica(String titulo) {
        Item result = new Item(new Epica(titulo));
        this.items.add(result);
        return result;
    }

    @Override
    public Role promote() {
        return this;
    }
}
