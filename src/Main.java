public class Main {
    public static void main(String[] args) {

        try {
            Prenda p1 = new Prenda("Vestido Floral", "Lino", 250.0, "Femenino", "Verano", 1000.0);
            Lote lote1 = new Lote(1001, 100, "2025-06-01", p1);
            System.out.println("--- RESULTADOS LOTE 1 ---");
            System.out.println("Costo Lote: $" + lote1.calcularCostoProduccionLote());
            System.out.println("Precio por pieza: $" + lote1.calcularPrecioVentaPorPieza());
            System.out.println("Monto recuperacion: $" + lote1.calcularMontoRecuperacionLote());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Prenda p2 = new Prenda("Pants", "Mezclilla", 300.0, "Niños", "Otoño", 1000.0);
        } catch (GeneroInvalidoException e) {
            System.out.println("Excepción -> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Prenda p3 = new Prenda("Camisa", "Algodón", 150.0, "Masculino", "Monsoon", 1000.0);
        } catch (TemporadaInvalidaException e) {
            System.out.println("Excepción -> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Prenda p4 = new Prenda("Abrigo", "Cashmere", 1500.0, "Mixto", "Invierno", 1000.0);
        } catch (CostoExcedidoException e) {
            System.out.println("Excepción -> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Prenda p5 = new Prenda("Blusa", "Seda", 200.0, "Femenino", "Primavera", 1000.0);
            Lote lotemalo = new Lote(1002, 10, "2025-07-01", p5);
        } catch (PiezasInvalidasException e) {
            System.out.println("Excepción -> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}