import java.util.ArrayList;

public class Cafe {
    private String name;
    private boolean isOpen;
    private final Schedule schedule;
    private final ArrayList<Snack> snacks;

    public Cafe(String name, String openTime, String CloseTime) {
        this.name = name;
        this.isOpen = false;
        this.schedule = new Schedule(openTime, CloseTime);
        this.snacks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public boolean addSnack(Snack snack) {
        // Regla simple: no permitir códigos duplicados
        if (findSnackByCode(snack.getCode()) != null) {
            return false; // ya existe
        }
        snacks.add(snack);
        return true;
    }

    public Snack findSnackByCode(String code) {
        for (Snack s : snacks) {
            if (s.getCode().equalsIgnoreCase(code)) {
                return s;
            }
        }
        return null;
    }


    public void showSnacks() {
        if (snacks.isEmpty()) {
            System.out.println("No hay snacks registrados.");
        } else {
            for (Snack snack : snacks) {
                System.out.println(snack);
            }
        }
    }


    public boolean updateSnackStock(String code, int delta) {
        Snack snack = findSnackByCode(code);
        if (snack == null) return false;

        int newStock = snack.getStock() + delta;
        if (newStock < 0) return false;

        snack.setStock(newStock);
        return true;
    }

    public float registerSale(String code, int quantity) {
        Snack snack = findSnackByCode(code);
        if (snack == null) return -1;           // no existe
        if (quantity <= 0) return -2;           // cantidad inválida
        if (snack.getStock() < quantity) return -3; // stock insuficiente

        snack.setStock(snack.getStock() - quantity);
        return snack.getPrice() * quantity;     // total de la venta
    }
}
