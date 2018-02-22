import java.io.*;
import java.*;
import java.util.*;
public class main {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		double peso = teclado.nextDouble();
		double altura = teclado.nextDouble();
		double imc = peso / (altura * altura);
		System.out.print (imc);
		
	}
}
