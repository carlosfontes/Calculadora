package singleton;

public class CarrinhoCompra {
	
	private static	 CarrinhoCompra instanciaCarrinho;
	
		
	public CarrinhoCompra getInstance(){
		/* usar essa instancia como tutorial e dale.
		 */
		if(instanciaCarrinho == null){
			instanciaCarrinho = new CarrinhoCompra();
			System.out.println("Criando a instância pela primeira vez...");
		}else{
			//Mostrar que a instância é criada uma única vez.
			 System.out.println(" Uma instância já foi criada...");
		}
			
		return instanciaCarrinho;
	}
	

}
