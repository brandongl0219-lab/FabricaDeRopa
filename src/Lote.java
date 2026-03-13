public class Lote {


    private int numeroLote;
    private int numeroPiezas;
    private String fechaFabricacion;
    private Prenda prenda;


    public Lote(int numeroLote, int numeroPiezas, String fechaFabricacion, Prenda prenda) {
        this.numeroLote = numeroLote;
        this.numeroPiezas = numeroPiezas;
        this.fechaFabricacion = fechaFabricacion;
        this.prenda = prenda;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public int getNumeroPiezas() {
        return numeroPiezas;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public void setNumeroPiezas(int numeroPiezas) {
        this.numeroPiezas = numeroPiezas;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }


    public double calcularCostoProduccionLote() {
        return prenda.getCostoProduccionPorPieza() * numeroPiezas;
    }


    public double calcularPrecioVentaPorPieza() {
        return prenda.getCostoProduccionPorPieza() * 1.15;
    }


    public double calcularMontoRecuperacionLote() {
        double precioPorPiezaEnLote = prenda.getCostoProduccionPorPieza() * 1.05;
        return precioPorPiezaEnLote * numeroPiezas;
    }

    public String toString() {
        return "Lote #" + numeroLote +
                " | Piezas: " + numeroPiezas +
                " | Fecha: " + fechaFabricacion +
                " | " + prenda.toString();
    }
}