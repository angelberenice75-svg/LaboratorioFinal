package categoria;

public class categoria {
	public class Categoria {
	    
	    // Atributos
	    private int idCategoria;
	    private String nombre;

	   
	    public Categoria(int id, String nombre) {
	        this.idCategoria = id;
	        this.nombre = nombre;
	    }

	    // Getter de idCategoria
	    public int getIdCategoria() {
	        return idCategoria;
	    }

	    // Setter de idCategoria
	    public void setIdCategoria(int id) {
	        this.idCategoria = id;
	    }

	    // Getter de nombre
	    public String getNombre() {
	        return nombre;
	    }

	    // Setter de nombre
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    // Método toString
	  
	    public String toString() {
	        return "Categoria [idCategoria=" + idCategoria + ", nombre=" + nombre + "]";
	    }
	}
}
