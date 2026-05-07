import java.util.Objects;

public class Prenda implements Comparable<Prenda>, java.util.Comparator<Prenda> {

    private String modelo;
    private String tela;
    private double costoProduccionPorPieza;
    private String genero;
    private String temporada;
    private double limiteMaximoCosto;

    public Prenda() {}

    public Prenda(String modelo, String tela, double costo, String genero, String temporada, double limite)
            throws GeneroInvalidoException, TemporadaInvalidaException, CostoExcedidoException {

        if (!genero.equalsIgnoreCase("Masculino") && !genero.equalsIgnoreCase("Femenino") && !genero.equalsIgnoreCase("Mixto"))
            throw new GeneroInvalidoException(genero);

        if (!temporada.equalsIgnoreCase("Primavera") && !temporada.equalsIgnoreCase("Verano")
                && !temporada.equalsIgnoreCase("Otoño") && !temporada.equalsIgnoreCase("Invierno"))
            throw new TemporadaInvalidaException(temporada);

        if (costo > limite)
            throw new CostoExcedidoException(costo, limite);

        this.modelo = modelo;
        this.tela = tela;
        this.costoProduccionPorPieza = costo;
        this.genero = genero;
        this.temporada = temporada;
        this.limiteMaximoCosto = limite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prenda prenda = (Prenda) o;
        return Objects.equals(modelo, prenda.modelo) && Objects.equals(tela, prenda.tela);
    }

    @Override
    public int hashCode() { return Objects.hash(modelo, tela); }

    @Override
    public int compareTo(Prenda p) { return this.modelo.compareTo(p.modelo); }

    @Override
    public int compare(Prenda p1, Prenda p2) { return Double.compare(p1.costoProduccionPorPieza, p2.costoProduccionPorPieza); }

    public String getModelo() { return modelo; }
    public double getCostoProduccionPorPieza() { return costoProduccionPorPieza; }

    @Override
    public String toString() { return "Prenda: " + modelo + " | Costo: $" + costoProduccionPorPieza; }
}