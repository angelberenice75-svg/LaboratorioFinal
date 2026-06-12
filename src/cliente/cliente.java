package cliente;

public class cliente {
	public class Cliente {
	    private int idCliente;
	    private String nombre;
	    private String direccion;
	    private String telefono;

	    public Cliente(int id, String nombre, String direccion, String telefono) {
	        this.idCliente = id;
	        this.nombre = nombre;
	        this.direccion = direccion;
	        this.telefono = telefono;
	    }

	    public int getIdCliente() { return idCliente; }
	    public void setIdCliente(int id) { this.idCliente = id; }

	    public String getNombre() { return nombre; }
	    public void setNombre(String nombre) { this.nombre = nombre; }

	    public String getDireccion() { return direccion; }
	    public void setDireccion(String direccion) { this.direccion = direccion; }

	    public String getTelefono() { return telefono; }
	    public void setTelefono(String telefono) { this.telefono = telefono; }

	    
	    public String toString() {
	        return "Cliente [ID=" + idCliente + ", Nombre=" + nombre + ", Dirección=" + direccion + ", Teléfono=" + telefono + "]";
	    }
	}
}
