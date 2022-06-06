package S302PatronObserver;

public class Agencia {

	private String name;

	public Agencia(String name) {
		this.name = name;
	}

	public void notify(String tendencia) {
		System.out.println("La bolsa " + tendencia);
	}

}
