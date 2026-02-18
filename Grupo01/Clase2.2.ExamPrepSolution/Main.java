import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cafe cafe = new Cafe("The Food Station", "6:00am", "5:00pm");

        boolean isRunningApp = true;
        while (isRunningApp){
            System.out.println("========== Sistema de cafetería KEY ==========");
            System.out.println("1. Agregar snack");
            System.out.println("2. Ver lista de snacks");
            System.out.println("3. Actualizar stock de producto");
            System.out.println("4. Registrar venta");
            System.out.println("5. Salir");
            System.out.print("Ingrese valor: ");
            int numero = sc.nextInt();
            sc.nextLine(); // limpiar salto de línea (util cuando se lee un dato desde teclado)
            switch (numero){
                case 1:
                    // ===== OPCIÓN 1: AGREGAR SNACK =====
                    System.out.println("\n--- Agregar snack ---");

                    System.out.print("Código: ");
                    String code = sc.nextLine().trim();

                    System.out.print("Nombre: ");
                    String name = sc.nextLine().trim();

                    float price;
                    while (true) {
                        System.out.print("Precio: ");
                        price = sc.nextFloat();
                        sc.nextLine(); // limpiar salto de línea
                        if (price >= 0) break;
                        System.out.println("Error: el precio no puede ser negativo.");
                    }

                    int stock;
                    while (true) {
                        System.out.print("Stock: ");
                        stock = sc.nextInt();
                        sc.nextLine(); // limpiar salto de línea
                        if (stock >= 0) break;
                        System.out.println("Error: el stock no puede ser negativo.");
                    }

                    Snack newSnack = new Snack(code, name, price, stock);

                    boolean added = cafe.addSnack(newSnack);
                    if (added) {
                        System.out.println("Snack agregado correctamente.\n");
                    } else {
                        System.out.println("Ya existe un snack con el código: " + code + "\n");
                    }
                    break;
                case 2:
                    System.out.println("\n--- Lista de Snacks ---");
                    cafe.showSnacks();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\n--- Actualizar stock de producto ---");

                    System.out.print("Ingrese el código del snack: ");
                    String codeToUpdate = sc.nextLine().trim();

                    Snack found = cafe.findSnackByCode(codeToUpdate);
                    if (found == null) {
                        System.out.println("No existe un snack con el código: " + codeToUpdate + "\n");
                        break;
                    }

                    System.out.println("Producto encontrado: " + found.getName());
                    System.out.println("Stock actual: " + found.getStock());

                    System.out.print("Ingrese cantidad a ajustar (ej: 5 para sumar, -3 para restar): ");
                    int delta = sc.nextInt();
                    sc.nextLine(); // limpiar salto de línea

                    boolean updated = cafe.updateSnackStock(codeToUpdate, delta);
                    if (updated) {
                        System.out.println("Stock actualizado. Nuevo stock: " + found.getStock() + "\n");
                    } else {
                        System.out.println("No se pudo actualizar. Verifique que el stock no quede negativo.\n");
                    }
                    break;
                case 4:
                    System.out.println("\n--- Registrar venta ---");

                    System.out.print("Ingrese el código del snack: ");
                    String codeSale = sc.nextLine().trim();

                    Snack snackSale = cafe.findSnackByCode(codeSale);
                    if (snackSale == null) {
                        System.out.println("No existe un snack con el código: " + codeSale + "\n");
                        break;
                    }

                    System.out.println("Producto: " + snackSale.getName());
                    System.out.println("Precio unitario: $" + snackSale.getPrice());
                    System.out.println("Stock disponible: " + snackSale.getStock());

                    int qty;
                    while (true) {
                        System.out.print("Cantidad a vender: ");
                        qty = sc.nextInt();
                        sc.nextLine(); // limpiar salto de línea
                        if (qty > 0) break;
                        System.out.println("Error: la cantidad debe ser mayor a 0.");
                    }

                    float total = cafe.registerSale(codeSale, qty);

                    if (total == -3) {
                        System.out.println("Stock insuficiente. No se registró la venta.\n");
                    } else if (total < 0) {
                        System.out.println("No se pudo registrar la venta (datos inválidos).\n");
                    } else {
                        System.out.println("\nVenta registrada");
                        System.out.println("Snack: " + snackSale.getName());
                        System.out.println("Cantidad: " + qty);
                        System.out.println("Total: $" + total);
                        System.out.println("Stock restante: " + snackSale.getStock() + "\n");
                    }
                    break;
                case 5: isRunningApp = false;
                    break;
                default:
                    System.out.println("Error: opción inválida");
                    break;
            }
        }

    }
}