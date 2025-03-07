public class Productos {

    private String nombre;
    private int codigo;
    private int precio;
    private int cantidad;

    public Productos(String nombre, int codigo, int precio, int cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "  Codigo: " + codigo + "  Precio: " + precio + "  Cantidad: " + cantidad;
    }
    
}
