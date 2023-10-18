package one.digitalinnovation.gof.factory;

public class Ingrediente {
    private String nome;
    private String medidaCaseira;

    public Ingrediente(String nome, String medidaCaseira) {
        this.nome = nome;
        this.medidaCaseira = medidaCaseira;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nome='" + nome + '\'' +
                ", medidaCaseira='" + medidaCaseira + '\'' +
                '}';
    }
}
