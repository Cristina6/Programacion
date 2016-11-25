import java.util.Scanner;

public class CuantasCifrasTiene {

	public static void main(String[] args) {
		
		//definir var
		int numero;
		int cifra=0;
		
		//Scannner para leer desde consola
		Scanner sc=new Scanner(System.in);
		
		//pedir numero
		System.out.print("Introduce un numero entre 0 y 9.999:");
		numero=sc.nextInt();
		cifra=0;
		
		  if(numero>=0)
	        {
	            cifra++;
	        }
	        if(numero>=10)
	        {
	            cifra++;
	        }
	        if(numero>=100)
	        {
	            cifra++;
	        }
	        if(numero>=1000)
	        {
	            cifra++;
	        }
	        if(cifra>=2)
	        {
	            System.out.println("tiene: "+cifra+" cifras.");
	        }else{
	            System.out.println("tiene: "+cifra+" cifra");
	        }
	          
	        while(numero>=0&&numero<=9999);
	        
	        
	        System.out.println("Ingreso un número fuera del rango.");
	        System.out.println("Compila de nuevo e ingresa un número dentro del rango 0 y 9.999.");
	        
		
		
		
		
		
		

	}

}
