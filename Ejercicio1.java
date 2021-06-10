import java.util.* ;
public class Ejercicio1{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero;
		int P = 0;
		int I = 0;
		// numero es el numero que hay ingresarr
		// p son numeros pares 
		// I son numerso impares 
		System.out.println("");
		System.out.println("*********Ejercicio1************");
		System.out.println("");
        System.out.println("Ingrese un numero entero positivo menor a 100");
		numero = scanner.nextInt();

		if(numero > 0 && numero < 100){
			for(int i = 1; i<= numero; i++){
				int aleatorio = (int)(Math.random()*100+1);
				System.out.println("El numero aleatorio es: " + aleatorio);
				if(aleatorio %2 == 0){
					P = P + 1; 
				}
				else{
					I = I + 1;
				}
				
			}
			System.out.println("La cantidad de numeros pares es: " + P);
			System.out.println("La cantidad de numeros impares es: " + I);

		}
		else{
			System.out.println("El valor ingresado no es valido.");
		}

	}
}