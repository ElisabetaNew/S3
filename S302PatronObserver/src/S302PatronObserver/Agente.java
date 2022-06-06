package S302PatronObserver;

import java.util.ArrayList;
import java.util.List;

public class Agente {
	
	private String tendencia;
    private List<Agencia> agencias = new ArrayList<Agencia>();

    public void register(Agencia agencia) {
        agencias.add(agencia);
    } 

    public void tendencia(String tendencia) {
        for(Agencia agencia: agencias) {
            agencia.notify(tendencia);
        }

    }

}
