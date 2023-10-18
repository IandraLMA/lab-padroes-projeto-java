package one.digitalinnovation.gof.factory;

import java.util.List;

public abstract class Panetone {
    protected List<Ingrediente> ingredienteList;

    public List<Ingrediente> getIngredientesList() {
        return ingredienteList;
    }

    @Override
    public String toString() {
        return "Panetone{" +
                "ingredienteList=" + ingredienteList +
                '}';
    }

    protected Panetone() {
    }

}
