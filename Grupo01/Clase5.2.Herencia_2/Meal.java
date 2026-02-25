public class Meal extends Product{
    private int calories;

    public Meal(String code, String name, float price, int stock, int calores) {
        super(code, name, price, stock);
        setCalores(calories);
    }

    /*
     * Impuestos por producto:
     *   - drink: precio + 15%
     *   - meal:  precio + 10%
     *   - snack: precio + 20%
     * */
    @Override
    public void setPrice(float price) {
        super.setPrice(price * 1.10f);
    }

    public int getCalores() {
        return calories;
    }

    public void setCalores(int calores) {
        this.calories = calores;
    }
}
