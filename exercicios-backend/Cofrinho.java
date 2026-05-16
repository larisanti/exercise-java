package uninter;
import java.util.ArrayList; // importa CLASSE "ArrayList"

public class Cofrinho {
	
	// private: para ENCAPSULAMENTO, protege quais classes tem acesso
	// ArrayList: lista dinâmica como no python
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

	public void adicionar(Moeda m) {
		listaMoedas.add(m);
	}

	public void remover(Moeda m) {
		// método remove só funciona porque sobrescrevi o equals nas filhas
		listaMoedas.remove(m);
	}

	public void listagemMoedas() {
		for (Moeda m : listaMoedas) {
			// se chama o info() do Real, Dolar ou Euro (apenas no momento da execução)
			m.info();
		}
	}

	public double totalConvertido() {
		double acumulado = 0;
		for (Moeda m : listaMoedas) {
			// polimorfismo: cada moeda faz sua própria conversão para Real
			acumulado += m.converter();
		}
		return acumulado;
	}
}