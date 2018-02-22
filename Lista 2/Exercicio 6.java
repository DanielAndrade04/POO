import java.io.*;
import java.*;
import java.util.*;
public class main {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double km = teclado.nextDouble();
		Double hr = teclado.nextDouble();
		Double calc = km / hr;
		System.out.print (calc + " KM por Horas");
	
	}
}
