package ar.edu.uba.fi.e2;

import java.util.Objects;

public class Item implements Role {
    private Role role;

    public Item(Role role) {
        this.role = role;
    }

    public Item promote() {
        this.role = this.role.promote();
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(role, item.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role);
    }
}
