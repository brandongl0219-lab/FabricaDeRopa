public class PiezasInvalidasException extends Exception {
    public PiezasInvalidasException(int piezas) {
        super("Piezas inválidas: " + piezas + ". Deben ser entre 50 y 350.");
    }
}
