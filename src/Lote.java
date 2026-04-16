import java.util.Objects;
import java.util.Comparator;

public class Lote implements Comparable<Lote>, Comparator<Lote> {
    private int numeroLote;
    private int numeroPiezas;
    private String fechaFabricacion;
    private Prenda prenda;

    public Lote() {}

    public Lote(int numeroLote, int numeroPiezas, String fechaFabricacion, Prenda prenda) {
        this.numeroLote = numeroLote;
        this.numeroPiezas = numeroPiezas;
        this.fechaFabricacion = fechaFabricacion;
        this.prenda = prenda;
    }

    public double calcularCostoProduccionLote() {
        return this.numeroPiezas * prenda.getCostoProduccionPorPieza();
    }

    public double calcularPrecioVentaPorPieza() {
        double costoBase = prenda.getCostoProduccionPorPieza();
        return costoBase + (costoBase * 0.15); // +15%
    }

    public double calcularMontoRecuperacionLote() {
        double costoBase = prenda.getCostoProduccionPorPieza();
        double precioPorPiezaEnLote = costoBase + (costoBase * 0.05); // +5%
        return precioPorPiezaEnLote * this.numeroPiezas;
    }

    @Override
    public int compareTo(Lote l) {
        return Integer.compare(this.numeroLote, l.numeroLote);
    }

    @Override
    public int compare(Lote l1, Lote l2) {
        return Integer.compare(l1.numeroPiezas, l2.numeroPiezas);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lote lote = (Lote) o;
        return numeroLote == lote.numeroLote;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroLote);
    }

    @Override
    public String toString() {
        return "Lote #" + numeroLote + " | Cantidad: " + numeroPiezas;
    }
}