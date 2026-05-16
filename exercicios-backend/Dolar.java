package uninter;

// extends: indica o uso de HERANÇA 
// class Dolar herda atributos e métodos da classe mãe
public class Dolar extends Moeda {

	public Dolar(double valor) {
		// super: chama o construtor da classe mãe pra inicializar o atributo "valor"
		super(valor);
	}

	// @Override: SOBRESCRITA de método
	// informa ao compilador um comportamento que foi declarado na classe mãe
	@Override
	public void info() {
		System.out.println("Dólar - Valor: $ " + valor);
	}

	@Override
	public double converter() {
		return valor * 5.0; // cotação: $1 = R$5,00
	}

	// sobrescrita do método "equals" pra comparar o conteúdo dos objetos 
	// faz com que o ArrayList encontre a moeda pelo valor e tipo para remover
	@Override
	public boolean equals(Object obj) {
		// instanceof: verifica se o objeto é do tipo "Dolar"
		if (!(obj instanceof Dolar)) {
			return false;
		}

		// transforma o objeto genérico em objeto "Dolar"
		Dolar outra = (Dolar) obj;

		// compara se os valores são iguais
		return this.valor == outra.valor;
	}
}