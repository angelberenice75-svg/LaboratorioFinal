package producto;
import categoria.categoria.Categoria;

public class producto {
    
		    private int idProducto;
		    private String nombre;
		    private double precioCompra;
		    private double precioVenta;
		    private int cantidadMax;
		    private int cantidadMin;
		    private Categoria categoria;

		   
		    public Producto(int id, String nombre, double pC, double pV, Categoria cat) {
		        this.idProducto = id;
		        this.nombre = nombre;
		        this.precioCompra = pC;
		        this.precioVenta = pV;
		        this.categoria = cat;
		    }

		    // Getters y Setters
		    public int getIdProducto() {
		        return idProducto;
		    }

		    public void setIdProducto(int id) {
		        this.idProducto = id;
		    }

		    public String getNombre() {
		        return nombre;
		    }

		    public void setNombre(String nombre) {
		        this.nombre = nombre;
		    }

		    public double getPrecioCompra() {
		        return precioCompra;
		    }

		    public void setPrecioCompra(double precio) {
		        this.precioCompra = precio;
		    }

		    public double getPrecioVenta() {
		        return precioVenta;
		    }

		    public void setPrecioVenta(double precio) {
		        this.precioVenta = precio;
		    }

		    public int getCantidadMax() {
		        return cantidadMax;
		    }

		    public void setCantidadMax(int cant) {
		        this.cantidadMax = cant;
		    }

		    public int getCantidadMin() {

	}
}
