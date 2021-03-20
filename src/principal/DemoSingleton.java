package principal;

import singleton.CarrinhoCompra;


public class DemoSingleton {

	public static void main(String[] args){
		
		System.out.println("Primeira chamada....");
		CarrinhoCompra meuCarrinho = new CarrinhoCompra();
		meuCarrinho.getInstance();
		
		
		
	}
	
}


