import java.util.Scanner;

public class EjercicioTienda {

	public static void main(String[] args) {
		
		// definicion de constantes
		//producto de la semana para aplicar dto
		final String PROD_SEMANA="Peras";
		//dto a aplicar por producto de la semana
		final double DTO_PROD_SEM=5;
		//volumen minimo para aplicar dto
		final double VOL_MIN_DTO=100;
		//dto a aplicar por volumen de compra 
		final double DTO_VOLUMEN=10;
		
		
		//def vars
		String producto;
		double precio;
		double cantidad;
		double total;
		double dto;
		//def del scanner para leer por consola
		Scanner sc=new Scanner(System.in); 
		
		
		
		//pedir producto
		System.out.println("Producto:");
		//leer el producto
		producto=sc.nextLine();
		//pedir cantidad
		System.out.println("Cantidad:");
		//leer cantidad
		cantidad=sc.nextDouble();
		//pedir precio
		System.out.println("Precio:");
		//leer precio 
		precio=sc.nextDouble();
		//Calcular total
		total=cantidad*precio;
		
		//si el total es mayor que el Volumn aplicar el dto 
		if(total>VOL_MIN_DTO){
			 dto=total*DTO_VOLUMEN/100;
			total=total-dto;
			}
		//si es el producto de la semana aplicar  dto
		if(producto.equals(PROD_SEMANA)){
		dto=total*DTO_PROD_SEM/100;
		total=total-dto;
		}
		
		//escribir el mensaje 
		System.out.print(" Has comprado  " +cantidad+ "  Kg de " +producto+ "," +(precio*cantidad)+  " € a pagar");
	}}
	

