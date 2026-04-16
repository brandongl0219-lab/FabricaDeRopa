import java.util.Objects;
import java.util.Comparator;

public class Prenda implements Comparable<Prenda>, Comparator<Prenda> {
    private String modelo;
    private String tela;
    private double costoProduccionPorPieza;
    private String genero;
    private String temporada;

    public Prenda() {}

    public Prenda(String modelo, String tela, double costoProduccionPorPieza, String genero, String temporada) {
        this.modelo = modelo;
        this.tela = tela;
        this.costoProduccionPorPieza = costoProduccionPorPieza;
        this.genero = genero;
        this.temporada = temporada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prenda prenda = (Prenda) o;
        return Objects.equals(modelo, prenda.modelo) && Objects.equals(tela, prenda.tela);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, tela);
    }

    @Override
    public int compareTo(Prenda p) {
        // Orden natural por modelo (alfabético)
        return this.modelo.compareTo(p.modelo);
    }

    @Override
    public int compare(Prenda p1, Prenda p2) {
        // Orden por costo de producción
        return Double.compare(p1.costoProduccionPorPieza, p2.costoProduccionPorPieza);
    }

    public String getModelo() { return modelo; }
    public double getCostoProduccionPorPieza() { return costoProduccionPorPieza; }

    @Override
    public String toString() {
        return "Prenda: " + modelo + " | Costo: $" + costoProduccionPorPieza;
    }
}