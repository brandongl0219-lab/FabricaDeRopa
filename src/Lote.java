import java.util.Objects;

public class Lote implements Comparable<Lote>, java.util.Comparator<Lote> {

    private int numeroLote;
    private int numeroPiezas;
    private String fechaFabricacion;
    private Prenda prenda;

    public Lote() {}

    public Lote(int numeroLote, int piezas, String fecha, Prenda prenda) throws PiezasInvalidasException {
        if (piezas < 50 || piezas > 350)
            throw new PiezasInvalidasException(piezas);

        this.numeroLote = numeroLote;
        this.numeroPiezas = piezas;
        this.fechaFabricacion = fecha;
        this.prenda = prenda;
    }

    public double calcularCostoProduccionLote() { return numeroPiezas * prenda.getCostoProduccionPorPieza(); }

    public double calcularPrecioVentaPorPieza() {
        double costo = prenda.getCostoProduccionPorPieza();
        return costo + (costo * 0.15);
    }

    public double calcularMontoRecuperacionLote() {
        double costo = prenda.getCostoProduccionPorPieza();
        return (costo + (costo * 0.05)) * numeroPiezas;
    }

    @Override
    public int compareTo(Lote l) { return Integer.compare(this.numeroLote, l.numeroLote); }

    @Override
    public int compare(Lote l1, Lote l2) { return Integer.compare(l1.numeroPiezas, l2.numeroPiezas); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return numeroLote == ((Lote) o).numeroLote;
    }

    @Override
    public int hashCode() { return Objects.hash(numeroLote); }

    @Override
    public String toString() { return "Lote #" + numeroLote + " | Cantidad: " + numeroPiezas; }
}