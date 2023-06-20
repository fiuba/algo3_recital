package ar.edu.uba.fi.e2;

import java.util.Objects;

public class Issue implements Role {
    private String titulo;

    public Issue(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Issue issue = (Issue) o;
        return Objects.equals(titulo, issue.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    public Epica promote() {

        return new Epica(this.titulo);
    }
}
