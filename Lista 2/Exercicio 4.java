import java.io.*;
import java.*;
import java.util.*;
public class main {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		if(n >= 0)
		System.out.print ("Positivo");
		else 
		System.out.print ("Negativo");
	}
}
