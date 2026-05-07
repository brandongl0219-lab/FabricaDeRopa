public class TemporadaInvalidaException extends Exception {
    public TemporadaInvalidaException(String temporada) {
        super("Temporada inválida: " + temporada + ". Debe ser Primavera, Verano, Otoño o Invierno.");
    }
}
