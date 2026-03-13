public class Prenda {


    private String modelo;
    private String tela;
    private double costoProduccionPorPieza;
    private String genero;
    private String temporada;

    public Prenda(String modelo, String tela, double costoProduccionPorPieza, String genero, String temporada) {
        this.modelo = modelo;
        this.tela = tela;
        this.costoProduccionPorPieza = costoProduccionPorPieza;
        this.genero = genero;
        this.temporada = temporada;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTela() {
        return tela;
    }

    public double getCostoProduccionPorPieza() {
        return costoProduccionPorPieza;
    }

    public String getGenero() {
        return genero;
    }

    public String getTemporada() {
        return temporada;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public void setCostoProduccionPorPieza(double costoProduccionPorPieza) {
        this.costoProduccionPorPieza = costoProduccionPorPieza;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String toString() {
        return "Prenda: " + modelo +
                " | Tela: " + tela +
                " | Costo por pieza: " + costoProduccionPorPieza +
                " | Genero: " + genero +
                " | Temporada: " + temporada;
    }
}