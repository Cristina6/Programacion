import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//numero maximo de asignaturas de un alumno
		final int NUM_ASIG_ALUM=3;
		
		
		
		//crear un scanner para leer por consola, objeto
		Scanner sc=new Scanner(System.in);
		
		
		
		// definir una var para guardar la nota
		// de programacion 
		int notaProg;
		// definir una var para guardar la nota de bbdd
		int notaBD;
		// definir una var para guardar la nota de leng marcas
		int notaLM;
		
		//var para guardas el nombre dl usuario
		String nombre; 
		//Pedir el nombre al usuario 
		System.out.print("Nombre:");
		//leer el nombre del usuario
		nombre=sc.nextLine();
		
		
		// Pedir las notas al usuario
		System.out.println("Intriduce tus notas...");
		System.out.print("Programacion:");
		notaProg=sc.nextInt();
		
		System.out.print("BBDD:");
		notaBD=sc.nextInt();
		
		System.out.print("Lenguaje de Marcas:");
		notaLM=sc.nextInt();
		
		
		//definir una var para calcular la media, numero con decimal
		double notaMedia=(double)(notaProg+notaBD+notaLM)/NUM_ASIG_ALUM;
				
		//escribe tu media por consola
				
		System.out.print(nombre+" tu Nota Media es:"+String.format("%.1f",notaMedia));
				
		
		
		

	}

}
