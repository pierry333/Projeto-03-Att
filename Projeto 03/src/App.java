import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		//Variaveis
	    	
		Scanner sc = new Scanner(System.in);	
		
		//Instaciação de Objetos
		
		Calculdora calc = new Calculdora();
		Calculdora calc2 = new Calculdora();
		
		//Entrada de dados
	    
	    System.out.println("Forneça valor de x: ");
	    calc.x = sc.nextInt();
	    System.out.println("Forneça valor de y: ");
	    calc.y = sc.nextInt();
	    
	    System.out.println("Digite o valor de X para calc2: ");
	    calc2.x = sc.nextInt();
	    System.out.println("Digite o valor de Y para calc2: ");
	    calc2.y = sc.nextInt();
		
	    //Chamada para o metodo, com parametros
	    
	    System.out.println("");
		System.out.println("================ CALC ==============");
		calc.soma();
		int somaApp = calc.soma(40, 50);
		calc.subtracao();
		calc.multiplicacao();
		calc.divisao();
		
		System.out.println("");
		System.out.println("================ CALC 2 ==============");
		calc2.soma();
		calc2.subtracao();
		calc2.multiplicacao();
		calc2.divisao();
		
		}

}
