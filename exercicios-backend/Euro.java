package uninter;

// extends: indica o uso de HERANÇA 
// class Euro herda atributos e métodos da classe mãe
public class Euro extends Moeda {

	public Euro(double valor) {
		// super: chama o construtor da classe mãe pra inicializar o atributo "valor"
		super(valor);
	}

	// @Override: SOBRESCRITA de método
	@Override
	public void info() {
		System.out.println("Euro - Valor: € " + valor);
	}

	@Override
	public double converter() {
		return valor * 5.5; // cotação: €1 = R$5,50
	}

	// sobrescrita do método "equals" pra comparar o conteúdo dos objetos 
	@Override
	public boolean equals(Object obj) {
		// instanceof: verifica se o objeto é do tipo "Euro"
		if (!(obj instanceof Euro)) {
			return false;
		}

		// transforma o objeto genérico em objeto "Euro"
		Euro outra = (Euro) obj;

		// compara se os valores são iguais
		return this.valor == outra.valor;
	}
}