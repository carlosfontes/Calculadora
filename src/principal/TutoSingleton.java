package principal;
import java.util.*; 
import singleton.SeletorDeAjuda;


public class TutoSingleton {

	public static void main(String[] args){
		
		
		Scanner scannerUserInputTuto = new Scanner(System.in);  
		System.out.print("Digite sobre qual função você gostaria de saber mais:" +"\n"+ "[1] Adição | [2] Subtração | [3] Multiplicação | [4] Divisão" +"\n");
		int seletorDaOperaçaoDeAjuda = scannerUserInputTuto.nextInt();  
				
		SeletorDeAjuda minhaAjuda = new SeletorDeAjuda();
		minhaAjuda.getInstance(seletorDaOperaçaoDeAjuda);
		
		scannerUserInputTuto.close();
	}
	
}


