public final class Snack extends Product{
    private String brand;

    public Snack(String code,
                 String name,
                 float price,
                 int stock,
                 String brand){
        super(code, name, price, stock);
        setBrand(brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
