package singleton;

public class CarrinhoCompra {
	
	private static	 CarrinhoCompra instanciaCarrinho;
	
		
	public CarrinhoCompra getInstance(){
		/* usar essa instancia como tutorial e dale.
		 */
		if(instanciaCarrinho == null){
			instanciaCarrinho = new CarrinhoCompra();
			System.out.println("Criando a inst�ncia pela primeira vez...");
		}else{
			//Mostrar que a inst�ncia � criada uma �nica vez.
			 System.out.println(" Uma inst�ncia j� foi criada...");
		}
			
		return instanciaCarrinho;
	}
	

}
