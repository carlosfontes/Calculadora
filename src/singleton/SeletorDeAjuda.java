package singleton;

public class SeletorDeAjuda {
	
	private static	 SeletorDeAjuda instanciaAjuda;
	private int numeroSeletor;
		
	public SeletorDeAjuda getInstance(int getnumero){
		numeroSeletor = getnumero;
		if(numeroSeletor == 1) {
			System.out.println("O n�mero 1 seleciona a adi��o, que � uma das principais opera��es matem�ticas, ela est� associada � ideia de juntar ou agrupar elementos de conjuntos. Exemplo: 9 + 3 = 12");
		} else if (numeroSeletor == 2) {
			System.out.println("O n�mero 2 seleciona a subtra��o, que � uma das quatro opera��es matem�ticas b�sicas na qual, para cada dois valores, um � subtra�do do outro, ou seja, uma quantidade � retirada de outra, e o valor restante � o resultado dessa opera��o. Exemplo: 9 - 3 = 6");
		} else if (numeroSeletor == 3) {
			System.out.println("O n�mero 3 seleciona a multiplica��o, que � a quantidade de vezes que tal fator ser� somado � definido pelo outro fator da opera��o. Exemplo: 9 * 3 = 27");
		} else if (numeroSeletor == 4) {
			System.out.println("O n�mero 4 seleciona a divis�o, que consiste na fragmenta��o de conjuntos, que pode ter como resultado um n�mero inteiro ou um n�mero decimal. Exemplo: 9 / 3 = 3");
		} else {
			System.out.println("N�mero inv�lido");
		}
		
		instanciaAjuda = new SeletorDeAjuda();
		return instanciaAjuda;
	}
	

}
