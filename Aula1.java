package exemplo1;

import java.util.*;

public class Aula {
	public static void main(String[]args){
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		int n1 = teclado.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		int n2 = teclado.nextInt();

		int sum = n1+n2;
		int sub = n1-n2;
		int mult = n1*n2;
		int div = n1/n2;

		System.out.println("A soma entre "+n1+" e "+n2+" �: "+sum);
		System.out.println("A subtra��o entre "+n1+" e "+n2+" �: "+sub);
		System.out.println("A multiplica��o entre "+n1+" e "+n2+" �: "+mult);
		System.out.println("A divis�o entre "+n1+" e "+n2+" �: "+div);
		
	}
}

