import java.util.Scanner;

public class division_enteros{
	
	public static void main (String[] args) {
		
		int n1,n2,division;
		
		Scanner teclado= new Scanner (System.in);
		System.out.print("Introduce el primer numero");
		n1=teclado.nextInt();
		System.out.print("Introduce el segundo numero");
		n2=teclado.nextInt();
		division=n1/n2;
		
		System.out.println("El resultado de su division es:" +division);
}
}
