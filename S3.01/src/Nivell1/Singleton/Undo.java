package Nivell1.Singleton;

import java.util.ArrayList;

public class Undo {

	// patron Singleton (linea 8-20)
	private static Undo instancia;

	public static Undo getInstancia() {
		if (instancia == null) {
			instancia = new Undo();
		}
		return instancia;
	}

	private Undo() {
		ListaPedidos = new ArrayList<Pedido>();
	}

	private ArrayList<Pedido> ListaPedidos;

	public void agregar(String articulo, int cantidad) {
		ListaPedidos.add(new Pedido(articulo, cantidad));
	}

	public void eliminar(String articulo) {

		boolean encontrado = false;
		int i = 0;

		while (encontrado == false && i < ListaPedidos.size()) {
			if (ListaPedidos.get(i).getArticulo().equalsIgnoreCase(articulo)) {
				ListaPedidos.remove(i);
				System.out.println("El pedido " + i + "ha sido eliminado");
				encontrado = true;
			}
			++i;
		}
	}

	@Override
	public String toString() {
		String s = "\n\nLISTADO DE PEDIDOS." + "\n---------- -------->\n";
		for (Pedido p : ListaPedidos)
			s += p.toString();
		return s;
	}

}
