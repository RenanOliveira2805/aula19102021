import java.util.Scanner;


public class Barbearia {

	public static void main(String[] args) {
		
		var stk = new Scanner(System.in);
		
		//SISTEMA DE BARBEIROS E CABELEREIRAS 
		System.out.println("______________________________________________________");
		System.out.println("  ***** BARBEARIA LOST'TI SEJAM BEM VINDOS *****  ");
		System.out.println("______________________________________________________");
		System.out.println("");
		System.out.println("ESCOLHA UM NÚMERO A BAIXO DE 1 A 9: ");
		System.out.println();
		System.out.println("Fabiana    [1]");
		System.out.println("Hewerton   [2]");
		System.out.println("Lucas      [3]");
		System.out.println("Jefferson  [4]");
		System.out.println("Ricardo    [5]");
		System.out.println("Fernando   [6]");
		System.out.println("Maria      [7]");
		System.out.println("Cainã      [8]");
		System.out.println("Dyego      [9]");
		
		int f = stk.nextInt();
	
		System.out.println("");

		switch (f) { 
		
			case 1:
				System.out.println ("Você irá fazer o cabelo com a Fabiana ");
			break;
			
			case 2:
				System.out.println("Você irá cortar o cabelo com o Hewerton ");
			break;
			
			case 3:
				System.out.println("Você irá cortar o cabelo com o barbeiro Lucas ");
			break;
			
			case 4:
				System.out.println("Você irá cortar o cabelo com o barbeiro jefferson ");
			break;
			
			case 5:
				System.out.println("Você irá cortar o cabelo com o barbeiro Ricardo ");
			break;
			
			case 6:
				System.out.println("Você irá cortar o cabelo com o barbeiro Fernando ");
			break;
			
			case 7:
				System.out.println("Você irá fazer o cabelo com a Maria ");
			break;
			
			case 8:
				System.out.println("Você irá cortar o cabelo com o cainã ");
			break;
			
			case 9:
				System.out.println("Você irá cortar o cabelo com o barbeiro Dyego ");
			break;
			default:
				System.out.println("Por favor escolha de 1 A 9 ");
		
	}		
		
				System.out.println("");
				
				Scanner nt = new Scanner(System.in);
				
				//SISTEMA DE CORTES FEMININOS E MASCULINOS
				System.out.println("____________________________________");
				System.out.println("    TIPOS DE CORTES MASC/FEM    ");
				System.out.println("____________________________________");
				System.out.println("");
				System.out.println("Disfarçado    R$25,00   [1]");
				System.out.println("surfista      R$35,00   [2]");
				System.out.println("Moikano       R$40,00   [3]");
				System.out.println("De1000        R$45,00   [4]");
				System.out.println("Cabelo e barba R$55,00  [5]");
				System.out.println("Chanel        R$85,00   [6]");
				System.out.println("Assimétrico   R$90,00   [7]");
				System.out.println("Long bob      R$75,00   [8]");
				System.out.println("SidCut        R$65,00   [9]");
				
		
				int n = nt.nextInt();
				
				switch(n) {
				case 1:
					System.out.println("O cliente optou por fazer o Disfarce ");
				break;
				
				case 2: 
					System.out.println("O Cliente optou por cortar surfista ");
				break;
				
				case 3:
					System.out.println("O cliente optou por cortar Moikano ");
				break;
				
				case 4:
					System.out.println("O cliente optou por fazer o corte De1000 ");
				break;
				
				case 5:
					System.out.println("O cliente optou por fazer cabelo e barba ");
				break;
				
				case 6:
					System.out.println("A cliente optou por fazer Channel ");
				break;
				
				case 7:
					System.out.println("A cliente optou por fazer Assimétrico ");
				break;
				
				case 8:
					System.out.println("A cliente optou por cortar Long bob ");
				break;
				
				case 9:
					System.out.println("A cliente optou por fazer SidCut ");
				break;
				default:
					System.out.println("Escolha o número de 1 A 9");
			}	
				System.out.println("");
				
				Scanner it = new Scanner(System.in);
				
				//SISTEMA DE QUIMÍCAS NO CABELO
				System.out.println("____________________");
				System.out.println("    QUIMICAS    ");
				System.out.println("____________________");
				System.out.println("");
				System.out.println("Progressiva  R$120,00 [1]");
				System.out.println("Alisamento   R$50,00  [2]");
				System.out.println("Tintura      R$45,00  [3]");
				System.out.println("Botox        R$240,00 [4]");
				System.out.println("Relaxamento  R$95,00  [5]");
				System.out.println("Selagem      R$77,00  [6]");
				System.out.println("Luzes        R$35,00  [7]");
				
				
				 int i = it.nextInt();
				
				switch(i) {
				
				case 1:
					System.out.println("A cliente vai passar progressiva ");
				break;
				
				case 2:
					System.out.println("O cliente vai passar alisante ");
				break;
				
				case 3:
					System.out.println("O cliente vai pintar o cabelo ");
				break;
				
				case 4:
					System.out.println("A cliente vai aplicar botox capilar ");
				break;
				
				case 5:
					System.out.println("A cliente vai fazer um relaxamento capilar ");
				break;
				
				case 6:
					System.out.println("A cliente vai fazer uma selagem ");
				break;
				
				case 7:
					System.out.println("O cliente irá fazer luzes no cabelo ");
				break;
				default:
					System.out.println("Infelizmente não entendi, escolha um número de 1 a 7 ");
					
		}
				
				Scanner pt = new Scanner(System.in);
				
				System.out.println("");
				
				
				//SISTEMA DE BEBIDAS
				System.out.println("--------------------------------");
				System.out.println("   BEBIDAS/COMIDAS    ");
				System.out.println("--------------------------------");
				
				System.out.println("heineken  R$4,50 [1]");
				System.out.println("Skol      R$3,75 [2]");
				System.out.println("Brahma    R$4,20 [3]");
				System.out.println("Eisenbahn R$5,30 [4]");
				System.out.println("Budweiser R$5,40 [5]");
				System.out.println("Kapp Uva  R$2,50 [6]");
				System.out.println("Toddynho  R$3,00 [7]");
				System.out.println("Água      R$2,00 [8]");
				
				int k = pt.nextInt();
				
				switch(k) {
				
				case 1:
					System.out.println("Você escolheu beber uma Heineken ");
				break;
				
				case 2:
					System.out.println("Você escolheu beber uma Skol");
				break;
				
				case 3:
					System.out.println("Você escolheu beber uma Brahma ");
				break;
				
				case 4:
					System.out.println("Você escolheu beber uma Eisenbahn ");
				break;
				
				case 5:
					System.out.println("Você escolheu beber uma Budweiser");
				break;
				
				case 6:
					System.out.println("Você escolheu tomar um suco Kapp de uva");
				break;
				
				case 7:
					System.out.println("Você escolheu tomar um Toddynho");
				break;
				
				case 8:
					System.out.println("Você escolheu tomar uma Água");
				break;
				
		
				
		}		System.out.println("");
				

				//SISTEMA DE SOMAS DAS COMPRAS
				Scanner tk = new Scanner(System.in);

	
				float num1 = 0;
				float num2 = 0;
				float num3 = 0;
				float soma;
				
				System.out.println("Preço do corte: ");
			    num1 = tk.nextFloat();
			       
			    System.out.println("Preço da Quimica: ");
			    num2 = tk.nextFloat();
			    
			    System.out.println("Preço da bebida: ");
			    num3 = tk.nextFloat();
			             
			    soma = num1+num2+num3;
			    System.out.println("TOTAL GASTOS: " + soma);
				
				
			    System.out.println("");
			    
			    
			    //SISTEMA DE PAGAMENTOS
				Scanner pk = new Scanner(System.in);
	
					
				System.out.println("Formas de Pagamento: ");
	
				System.out.println("Débito  	[1]");
				System.out.println("Crédito 	[2]");
				System.out.println("Dinheiro 	[3]");

	
				int vk = pk.nextInt();
	
		    	switch(vk) {
	
		  		case 1:
		  			System.out.println("Cartão de Débito ");
		  		break;
	
		  		case 2:
		  			System.out.println("Cartão de Crédito ");
		    	break;
	
		  		case 3:
		  			System.out.println("Pagamento em Dinheiro ");
		    	break;
		    	default:
		    	System.out.println("Não aceitamos fiado perdão ");
							
				
		    	System.out.println("");	
		    	
	  }
		System.out.println("VOLTE SEMPRE A BARBEARIA LOS'TI OBRIGADO PELA PREFERÊNCIA");
	
   }

}		
		
		

	


