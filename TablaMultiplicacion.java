import java.util.Scanner;
public class TablaMultiplicacion{
public static void main(String[] args){
	Scanner entrada =new Scanner (System.in);
	double numero,resultado;
	System.out.print("Digite el numero de la tabala que desea calcular: ");
		numero=entrada.nextInt();
	for(int i=1; i <= 10; i++){
		resultado=numero*i;
		System.out.println( + numero + " * " + i + " : " + resultado);

	}
		System.out.print("\n\n");
}
	}

