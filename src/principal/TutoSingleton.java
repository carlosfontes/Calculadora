package principal;
import java.util.*; 
import singleton.SeletorDeAjuda;


public class TutoSingleton {

	public static void main(String[] args){
		
		
		Scanner scannerUserInputTuto = new Scanner(System.in);  
		System.out.print("Digite sobre qual fun��o voc� gostaria de saber mais:" +"\n"+ "[1] Adi��o | [2] Subtra��o | [3] Multiplica��o | [4] Divis�o" +"\n");
		int seletorDaOpera�aoDeAjuda = scannerUserInputTuto.nextInt();  
				
		SeletorDeAjuda minhaAjuda = new SeletorDeAjuda();
		minhaAjuda.getInstance(seletorDaOpera�aoDeAjuda);
		
		scannerUserInputTuto.close();
	}
	
}


