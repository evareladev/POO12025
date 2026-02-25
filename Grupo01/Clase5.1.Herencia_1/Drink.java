public class Drink extends Product{
    private String flavor;

    public Drink(String code, String name, float price, int stock, String flavor) {
        super(code, name, price, stock);
        setFlavor(flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
