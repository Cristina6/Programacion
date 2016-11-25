import java.util.Scanner;

public class CirculoYArea {

	public static void main(String[] args) {
		
		
		double area;
		double radio;
		//scanner para leer desdee consola
		Scanner num=new Scanner(System.in);
		//pedir el radio del circulo
		System.out.print("Introduce el radio de un Circulo:");
		//leer radio
		radio=num.nextDouble();
		//leer area
		area=Math.PI*(radio*radio);
		//ejecutar area del circulo
		System.out.print("El area del circulo es:  " +area);
		
		
	}

}
