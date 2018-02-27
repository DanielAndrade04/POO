import java.io.*;
import java.*;
import java.util.*;
public class main {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a Quantidade de Notas");
		Integer tam = sc.nextInt();		
		float calc=0;
		int[] vetor = new int[tam];
		for(int x=0; x < vetor.length; x++)
		{
			
		 System.out.println("Entre com os valores do vetor");
		 vetor[x] = sc.nextInt();
		 calc = calc + vetor[x];
		}

		if (calc >= 60)
		System.out.println("Aprovado " +calc);
		else 
		System.out.println("Reprovado " +calc);
		
	}
}
