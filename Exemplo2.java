import java.util.*;

public class Exemplo2 {
		public static void main(String[]args) {

			Scanner scan = new Scanner(System.in);
			
			System.out.print("Informe a sua altura: ");
			double altura = scan.nextDouble();
			
			System.out.print("Informe o seu peso: ");
			double peso = scan.nextDouble();
			
			double IMC = peso/(altura*altura);
			
			System.out.println("O seu IMC � de: "+ IMC);
			
			if(IMC < 18.5){
				System.out.print("Voc� est� com baixo peso!");
			}else if (IMC <= 24.9) {
				System.out.print("Voc� est� com o peso normal!");
			}else if (IMC <= 29.9) {
				System.out.print("Voc� est� com sobrepeso!");
			}else if(IMC <= 34.9) {
				System.out.print("Voc� est� com obesidade!");
			}else {
				System.out.print("\nVoc� est� com obesidade m�rbida");
			}
		
		}
}
