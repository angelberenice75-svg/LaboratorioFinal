package venta;
import java.util.ArrayList;

import cliente.cliente.Cliente;
import empleado.empleado.Empleado;

public class venta {


	    // Atributos privados
	    private int idVenta;
	    private String fecha;
	    private double total;
	    private Cliente cliente;
	    private Empleado empleado;
	    private ArrayList<DetalleVenta> detalles;

	    // Constructor
	    public Venta(int id, String fecha, Cliente cli, Empleado emp) {
	        this.idVenta = id;
	        this.fecha = fecha;
	        this.cliente = cli;
	        this.empleado = emp;
	        this.detalles = new ArrayList<>();
	        this.total = 0.0;
	    }

	    // Métodos Getter y Setter
	    public int getIdVenta() { return idVenta; }

	    public String getFecha() { return fecha; }
	    public void setFecha(String fecha) { this.fecha = fecha; }

	    public Cliente getCliente() { return cliente; }
	    public void setCliente(Cliente cli) { this.cliente = cli; }

	    public Empleado getEmpleado() { return empleado; }
	    public void setEmpleado(Empleado emp) { this.empleado = emp; }

	    // Lógica de Negocio
	    public void agregarDetalle(DetalleVenta det) {
	        this.detalles.add(det);
	    }

	    public double calcularTotal() {
	        double suma = 0;
	        for (DetalleVenta det : detalles) {
	            suma += det.getSubtotal();
	        }
	        this.total = suma;
	        return this.total;
	    }

	    public ArrayList<DetalleVenta> getDetalles() {
	        return detalles;
	    }

	    @Override
	    public String toString() {
	        return "Venta [ID=" + idVenta + ", Fecha=" + fecha + ", Total=" + total + "]";
	    }
	}

