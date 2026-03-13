public class Main {

    public static void main(String[] args) {

        Prenda prenda1 = new Prenda("Vestido Floral", "Lino", 250.0, "femenino", "verano");
        Lote lote1 = new Lote(1001, 50, "2025-06-01", prenda1);

        System.out.println("LOTE 1");
        System.out.println(lote1);
        System.out.println("Costo de produccion del lote: " + lote1.calcularCostoProduccionLote());
        System.out.println("Precio de venta por pieza (individual): " + lote1.calcularPrecioVentaPorPieza());
        System.out.println("Monto de recuperacion del lote completo: " + lote1.calcularMontoRecuperacionLote());

        System.out.println();

        Prenda prenda2 = new Prenda("Abrigo Clasico", "Lana", 800.0, "masculino", "invierno");
        Lote lote2 = new Lote(1002, 30, "2025-11-15", prenda2);

        System.out.println("LOTE 2");
        System.out.println(lote2);
        System.out.println("Costo de produccion del lote: " + lote2.calcularCostoProduccionLote());
        System.out.println("Precio de venta por pieza (individual): " + lote2.calcularPrecioVentaPorPieza());
        System.out.println("Monto de recuperacion del lote completo: " + lote2.calcularMontoRecuperacionLote());

        System.out.println();

        Prenda prenda3 = new Prenda("Camiseta Basica", "Algodon", 120.0, "mixto", "primavera");
        Lote lote3 = new Lote(1003, 100, "2025-03-20", prenda3);

        System.out.println("LOTE 3");
        System.out.println(lote3);
        System.out.println("Costo de produccion del lote: " + lote3.calcularCostoProduccionLote());
        System.out.println("Precio de venta por pieza (individual): " + lote3.calcularPrecioVentaPorPieza());
        System.out.println("Monto de recuperacion del lote completo: " + lote3.calcularMontoRecuperacionLote());
    }
}