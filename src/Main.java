public class Main {
    public static void main(String[] args) {
        Prenda p1 = new Prenda("Vestido Floral", "Lino", 250.0, "Femenino", "Verano");
        Prenda p2 = new Prenda("Abrigo Clasico", "Lana", 800.0, "Masculino", "Invierno");
        Lote lote1 = new Lote(1001, 50, "2025-06-01", p1);

        System.out.println("--- RESULTADOS LOTE 1 ---");
        System.out.println("Costo Lote: $" + lote1.calcularCostoProduccionLote());
        System.out.println("Precio Venta Individual: $" + lote1.calcularPrecioVentaPorPieza());
        System.out.println("Monto Recuperacion: $" + lote1.calcularMontoRecuperacionLote());

        System.out.println("\n--- PRUEBAS DE INTERFACES ---");
        System.out.println("Equals (p1 vs p2): " + p1.equals(p2));
        System.out.println("CompareTo (Lote 1001 vs 1002): " + lote1.compareTo(new Lote(1002, 0, "", p1)));
    }
}