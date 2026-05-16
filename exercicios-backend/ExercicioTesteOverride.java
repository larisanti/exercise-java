// lembrar de: selecionar "main" para executar teste

package exercicios.back
public class ExercicioTesteOverride {

	public static void main(String[] args) {
		
		// teste 1
		ExercicioPojo pessoa1 = new ExercicioPojo("Lari", 85);
		System.out.println(pessoa1);
		
		// teste 2
		// java considera "equal" quando um objeto ocupa o mesmo lugar na memória
		// precisa sobescrever para que considere os atributos e os compare
		ExercicioPojo pessoa2 = new ExercicioPojo("Lari", 85);
		System.out.println(pessoa1.equals(pessoa2));

		// teste 3
		System.out.println(pessoa1.hashCode() + " | " + pessoa2.hashCode());
	}

}
