import java.io.*;
import java.*;
import java.util.*;
public class main {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double n1 = teclado.nextDouble();
		Double n2 = teclado.nextDouble();
		Double n3 = teclado.nextDouble();
		Double calc = n1 + n2 + n3;
		if (calc >= 60)
		System.out.print ( "Aprovado " +calc);
		else
		System.out.print ( "Reprovado " +calc);
	
	}
}
