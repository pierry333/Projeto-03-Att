//Metodo de variaveis de classe

import java.util.Scanner;

public class Calculdora {
	
	//Variaveis de Classe
	
	int x, y;
	int soma;
	int subtracao;
	int multiplicacao;
	int divisao;
	
	
	
    public void soma() {
		
    //Processamento
    
    soma = x + y;
    
    //Saida de dados
    
    System.out.println("[Metodo Soma] Soma: " + soma);
    
	}
	
    public int soma(int x, int y) {
    	
    	//Variaveis 
    	
    	int soma = x + y;
    	
    	System.out.println("[M�todo Soma com par�metros] Soma: " +soma);
    	
    	return soma;
    }
    
    public void subtracao() {
	
        //Processamento
        
        subtracao = x - y;
        
        //Saida de dados
        
        System.out.println("[Metodo Subtra��o] Subtra��o: " + subtracao);
	}
    
    public void multiplicacao() {
    	
        //Processamento
        
        multiplicacao = x * y;
        
        //Saida de dados
        
        System.out.println("[Metodo Multiplica��oo] Multiplica��o: " + multiplicacao);
	}
    
    public void divisao() {


    	
    	//Processamento
        
        divisao = x / y;
        
        //Saida de dados
        
        System.out.println("[Metodo Divis�o] Divis�o: " + divisao);
    	
	}

}
