public class Pupusa implements Comida, Tipico{
    private String tipo;
    private int cantidad;
    private String precioUnitario;

    public Pupusa(String tipo, int cantidad, String precioUnitario) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(String precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public void  cocinar(){
        System.out.println("Preparando pedido de pupusas...");
    }

    @Override
    public void servir(){
        System.out.println("Entregando a cliente...");
    }

    @Override
    public void pagar(){
        System.out.println("Pagando pedido...");
    }

    @Override
    public void tipo() {
        System.out.println("Plato fuerte");
    }
}
