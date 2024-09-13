public class Store {
    // Defino constantes para los precios y cantidades de productos
    private static final int PRICE_PRODUCT1 = 15;
    private static final int PRICE_PRODUCT2 = 10;
    private static final int PRICE_PRODUCT3 = 5;
    private static final int QUANTITY_PRODUCT1 = 2;
    private static final int QUANTITY_PRODUCT2 = 3;
    private static final int QUANTITY_PRODUCT3 = 4;
    private static final int SALES_THRESHOLD = 50;

    public static void main(String[] args) {
        // Utilizo arrays para manejar precios y cantidades de productos
        int[] prices = { PRICE_PRODUCT1, PRICE_PRODUCT2, PRICE_PRODUCT3 };
        int[] quantities = { QUANTITY_PRODUCT1, QUANTITY_PRODUCT2, QUANTITY_PRODUCT3 };

        // Calcular las ventas totales usando un bucle
        int totalSales = 0;
        for (int i = 0; i < prices.length; i++) {
            totalSales += prices[i] * quantities[i];
        }

        // Evaluo el rendimiento de ventas
        if (totalSales > SALES_THRESHOLD) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
