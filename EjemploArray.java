import java.util.Scanner;

public class EjemploArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//definicion
		int[] tNotas={5,4,8,10};
		//pedir un numero y comprobar si se encuentra en el array
		Scanner sc=new Scanner(System.in);
		/*int num=0;
		System.out.print("Introduce Numero:");
		num=sc.nextInt();
		
		
		for(int i=0;i<tNotas.length;i++){
			if(tNotas[i]==num){
				System.out.print("Está!!");
				break;
			}else{
				System.out.print("NO ESTÁ!!!!");
			}
		}*/
		
		int numero=4;
		boolean enc=false;
		
			for(int i=0;i<tNotas.length;i++){
				if(tNotas[i]==numero){
					enc=true;
					break;
				}
			}
			if(enc==true){
				System.out.println("Encontrado");
			}else{
				System.out.println("No encontrado");
			}
		
		//pedir un numnero y mostrar en el primer indice en el que se encuentra
		int num=5;
		for(int i=0;i<tNotas.length;i++){
			if(tNotas[i]==num){
				System.out.println(i);
				break;
			}
		}
		
		//pedir un numero y mostrar los indices en los que se encuentra
		
		
		
		
		
		//
		/*System.out.print("[");
		for(int i=0;i<tNotas.length-1;i++){
			System.out.print(tNotas[i]+ " , ");
		}
		if(tNotas.length>0){
			System.out.print(tNotas[tNotas.length-1]+",");
		}else{
			System.out.print("]");
		*/}
	}


