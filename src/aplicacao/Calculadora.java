package aplicacao;

public class Calculadora {
	double numeroUm;
	double numeroDois;
	
public double Adicao (double numeroUm, double numeroDois) {
	return numeroUm + numeroDois;
}

public double Subtracao (double numeroUm, double numeroDois) {
    return numeroUm - numeroDois;
}

public double Multiplicacao (double numeroUm, double numeroDois) {
    return numeroUm * numeroDois;
}

public double Divisao (double numeroUm, double numeroDois) {
    if(numeroDois == 0) {
     System.out.println("Impossível realizar uma divisão por zero.");
     return Double.NaN;
    }else {
	     return numeroUm / numeroDois;
  }
}
public double Potencia (double numeroUm, double numeroDois) {
	if(numeroDois == 0) {
	      return 1;
	  }else{
		  return Math.pow(numeroUm, numeroDois);
	}
 }

public double RaizQuadrada (double numeroUm) {
	if(numeroUm == 0) {
	     System.out.println("Não existe raiz de número negativo.");
	     return 0;
	  }else{
		return Math.sqrt(numeroUm);
	  }
    }
}
