package aplicacao;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		
		double a, b = 0;
		char operador;
		
		do { System.out.print("Digite o primerio número :");
		     a = sc.nextDouble();
		     System.out.print("Digite o operador: ");
		     operador = sc.next().charAt(0);
		     
		     if (operador != '√' && operador != 'Q') {
					System.out.print("Digite o segundo número: ");
					b = sc.nextDouble();
				}
		    
		
		 switch(operador) {
		 case '+' :
			 System.out.println(calculadora.Adicao(a, b));
		     break;
		 case '-' :
			 System.out.println(calculadora.Subtracao(a, b));
			 break;
		 case '*' :
			 System.out.println(calculadora.Multiplicacao(a, b));
			 break;
		 case '/' :
			 System.out.println(calculadora.Divisao(a, b));
			 break;
		 case '^' :
			 System.out.println(calculadora.Potencia(a, b));
			 break;
		 case '√' :
			 System.out.println(calculadora.RaizQuadrada(a));
			 break;
		 case 'Q':
			 System.out.println("Saindo do programa..");
			 break;
		 default:
			 System.out.println("Digite um símbolo válido");
			 break;
      }
		}while(operador != 'Q');	
	
	sc.close();
		
	}
	
}
