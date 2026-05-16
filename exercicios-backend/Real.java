package uninter;

// extends: indica o uso de HERANÇA 
// class Real herda atributos e métodos da classe mãe
public class Real extends Moeda {

	public Real(double valor) {
		// super: chama o construtor da classe mãe pra inicializar o atributo "valor"
		super(valor);
	}
	//  @Override: SOBRESCRITA de método
	// informa ao compilador um comportamento que foi declarado na classe mãe
	@Override
	public void info() {
		System.out.println("Real - Valor: R$ " + valor);
	}

	@Override
	public double converter() {
		return valor; // Real para Real não muda nada
	}

	// sobrescrita do método "equals" pra comparar o conteúdo dos objetos 
	// faz com que o ArrayList encontre a moeda pelo valor e tipo para remover
	@Override
	public boolean equals(Object obj) {
		// instanceof: verifica se o objeto é do tipo "Real"
		if (!(obj instanceof Real)) {
			return false;
		}

		// transforma o objeto genérico em objeto "Real"
		Real outra = (Real) obj;

		// compara se os valores são iguais
		return this.valor == outra.valor;
	}
}