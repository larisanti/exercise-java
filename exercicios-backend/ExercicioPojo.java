// pratica de encapsulamento

package exercicios.back;

import java.util.Objects;

// criar uma classe pojo
public class ExercicioPojo {

// variaveis
	private String nome;
	private int peso;

// construtor (constructor) alternativo
	public ExercicioPojo(String nome, int peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}
	
// construtor vazio
public ExercicioPojo() {
		super();
	}

//métodos para modificar acesso (getters + setters)
// métodos de captura e configuração
//criar dois pares pois temos dois atributos nas variavies

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getPeso() {
	return peso;
}

public void setPeso(int peso) {
	this.peso = peso;
}

@Override
public String toString() {
	return "ExercicioPojo [nome=" + nome + ", peso=" + peso + "]";
}

@Override
public int hashCode() {
	return Objects.hash(nome, peso);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ExercicioPojo other = (ExercicioPojo) obj;
	return Objects.equals(nome, other.nome) && peso == other.peso;
}

}
