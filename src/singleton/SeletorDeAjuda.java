package singleton;

public class SeletorDeAjuda {
	
	private static	 SeletorDeAjuda instanciaAjuda;
	private int numeroSeletor;
		
	public SeletorDeAjuda getInstance(int getnumero){
		numeroSeletor = getnumero;
		if(numeroSeletor == 1) {
			System.out.println("O número 1 seleciona a adição, que é uma das principais operações matemáticas, ela está associada à ideia de juntar ou agrupar elementos de conjuntos. Exemplo: 9 + 3 = 12");
		} else if (numeroSeletor == 2) {
			System.out.println("O número 2 seleciona a subtração, que é uma das quatro operações matemáticas básicas na qual, para cada dois valores, um é subtraído do outro, ou seja, uma quantidade é retirada de outra, e o valor restante é o resultado dessa operação. Exemplo: 9 - 3 = 6");
		} else if (numeroSeletor == 3) {
			System.out.println("O número 3 seleciona a multiplicação, que é a quantidade de vezes que tal fator será somado é definido pelo outro fator da operação. Exemplo: 9 * 3 = 27");
		} else if (numeroSeletor == 4) {
			System.out.println("O número 4 seleciona a divisão, que consiste na fragmentação de conjuntos, que pode ter como resultado um número inteiro ou um número decimal. Exemplo: 9 / 3 = 3");
		} else {
			System.out.println("Número inválido");
		}
		
		instanciaAjuda = new SeletorDeAjuda();
		return instanciaAjuda;
	}
	

}
