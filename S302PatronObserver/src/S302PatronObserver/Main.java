package S302PatronObserver;

public class Main {

	public static void main(String[] args) {

		Agente agente = new Agente();

		agente.register(new Agencia("Agencia Bolsa Amiga"));

		agente.register(new Agencia("Bolsa de Barcelona"));

		agente.tendencia("sube");
		
		System.out.println("\nCambio de tendencia");
		agente.tendencia("baja");

	}
}
