public class Hamburguesa implements Comida, Tipico{
    private String precio;
    private String tipo;

    public Hamburguesa(String precio, String tipo) {
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Hamburguesa{" +
                "precio='" + precio + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public void preparar(){
        System.out.println("Preparando pedido....");
    }

    @Override
    public void pagar(){
        System.out.println("Pedido ha sido pagado.");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo comida al cliente.");
    }
}
