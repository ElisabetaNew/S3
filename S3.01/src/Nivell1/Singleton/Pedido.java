package Nivell1.Singleton;

public class Pedido {
	private String articulo;
	private int cantidad;
	
	public Pedido(String articulo, int cantidad) {
		this.articulo = articulo;
		this.cantidad = cantidad;
	}

	public String getArticulo() {
		return articulo;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Pedido [articulo=" + articulo + ", cantidad=" + cantidad + "]";
	}
	
	
}
