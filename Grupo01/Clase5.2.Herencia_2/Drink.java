public class Drink extends Product{
    private String flavor;

    public Drink(String code, String name, float price, int stock, String flavor) {
        super(code, name, price, stock);
        setFlavor(flavor);
    }

    /*
     * Impuestos por producto:
     *   - drink: precio + 15%
     *   - meal:  precio + 10%
     *   - snack: precio + 20%
     * */
    @Override
    public void setPrice(float price) {
        super.setPrice(price * 1.15f);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
