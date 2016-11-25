import java.util.Scanner;

public class Delegado {

	public static void main(String[] args) {
		
		int delegado;
		int subdelegado;
		int alumnos;
		
		
		//Scanner para leer de consola
		Scanner sc=new Scanner(System.in);
		
		// Pedir numero de alumnos
		System.out.print("Numero de alumnos:");
		
		//leer numero de alumnos
		alumnos=sc.nextInt();
		
		 delegado = (int) (Math.random()*22)+1;	
		 System.out.println("  El delegado es:  "+delegado);
		 subdelegado = (int) (Math.random()*22)+1;
		 System.out.print("  El subdelegado es: " +subdelegado);
		 
		//while
		 while (delegado==subdelegado || delegado==8 || subdelegado==8){
			 delegado = (int) (Math.random()*22)+1;	
			 System.out.println("  El delegado es:  "+delegado);
			 subdelegado = (int) (Math.random()*22)+1;
			 System.out.print("  El subdelegado es: " +subdelegado);
		 }

		
	}

}
