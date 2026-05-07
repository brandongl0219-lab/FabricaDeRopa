public class GeneroInvalidoException extends Exception {
    public GeneroInvalidoException(String genero) {
        super("Género inválido: " + genero + ". Debe ser Masculino, Femenino o Mixto.");
    }
}
