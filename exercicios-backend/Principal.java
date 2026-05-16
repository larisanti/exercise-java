package uninter;
import java.util.Scanner; // importa CLASSE Scanner para leitura de dados do teclado

public class Principal {
	public static void main(String[] args) {
		
		// inicia o Scanner para captura de input
		Scanner teclado = new Scanner(System.in);
		
		// instanciação de um objeto da classe Cofrinho.
		Cofrinho cofrinho = new Cofrinho();
		
		int opcao = -1;

		// while para manter o menu ativo até que a condição de saída (opcao == 0) seja atendida
		while (opcao != 0) {
			System.out.println("\nMENU COFRINHO (Larissa de Santi, RU: 4634463)");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Calcular Total");
			System.out.println("0 - Encerrar");
			opcao = teclado.nextInt();

			// estrutura condicional para agrupar as operações que exigem criação de objeto Moeda
			if (opcao == 1 || opcao == 2) {
				System.out.println("Escolha a Moeda: 1-Real | 2-Dólar | 3-Euro");
				int tipo = teclado.nextInt();
				System.out.print("Digite o valor: ");
				double valor = teclado.nextDouble();

				// cria variável de referência do tipo genérico (Moeda), que 
				// a variável pode apontar para qualquer objeto de suas subclasses
				Moeda m = null;
				
				if (tipo == 1) {
					m = new Real(valor);
				} else if (tipo == 2) {
					m = new Dolar(valor);
				} else if (tipo == 3) {
					m = new Euro(valor);
				} else {
					System.out.println("Tipo de moeda inválido!");
					continue; // retorna ao início do loop
				}

				// chamada dos métodos do objeto cofrinho passando a moeda criada
				if (opcao == 1) {
					cofrinho.adicionar(m);
				} else {
					cofrinho.remover(m);
				}

			} else if (opcao == 3) {
				// listagemMoedas: método que utiliza POLIMORFISMO para exibir a informação correta de cada moeda da lista
				cofrinho.listagemMoedas();
			} else if (opcao == 4) {
				// exibe o cálculo total convertido
				System.out.println("Total convertido para Real: R$ " + cofrinho.totalConvertido());
			}
		}
		
		System.out.println("Sistema finalizado.");
		
		// fecha o scanner
		teclado.close();
	}
}