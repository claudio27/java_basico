package ordenamiento;

/**
	Esta clase provee métodos para crear y visualizar arreglos, asi
	como también ordenarlos
*/
public class Ordenado{


/**
	@param arr[] int, imprime el arreglo
*/
public void imprime(int[] arr){

	System.out.print("[");
	
	for(int i = 0; i < arr.length; i ++){

		System.out.print(arr[i]);
		
		if(i != (arr.length - 1))
		{
			System.out.print(",");
		
		}
	}
	System.out.print("]");
	System.out.println(" -- ");


}

/**
	@param tam int, tamaño del arreglo con números aleatorios
	@return arr int[], con números desordenados del 1 - 99
*/

public int[] crea(int tam){


 int[] arr = new int[tam];

for(int i=0; i < arr.length; i++){

	arr[i] = (int) ((Math.random() * 99) + 1);
}

	return arr;


}

	


}


