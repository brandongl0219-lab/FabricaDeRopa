public class CostoExcedidoException extends Exception {
    public CostoExcedidoException(double costo, double limite) {
        super("Costo $" + costo + " supera el límite de $" + limite);
    }
}
