import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner entradaConsola = new Scanner(System.in);
		
		int numero1 = Integer.parseInt(entradaConsola.nextLine());
		int numero2 = Integer.parseInt(entradaConsola.nextLine());
		
		Operaciones operacionesObjeto = new Operaciones();
		
		System.out.println("Digite dos numeros: ");
		
		int totalSuma = operacionesObjeto.suma(numero1, numero2);
		
		System.out.println("El resultado de la suma es: " + totalSuma);
		
		int totalResta = operacionesObjeto.resta(numero1, numero2);
		
		System.out.println("El resultado de la resta es: " + totalResta);
		
		int totalMultiplicacion = operacionesObjeto.multiplicacion(numero1, numero2);
		
		System.out.println("El resultado de la multiplicaion es: " + totalMultiplicacion);
		
		int totalDivision = operacionesObjeto.division(numero1, numero2);
		
		System.out.println("El resualtado de la division es: " + totalDivision);
		
		int totalModulo = operacionesObjeto.modulo(numero1, numero2);
		
		System.out.println("El modulo es: " + totalModulo);
	
		
	}

}
