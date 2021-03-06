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

	/**
		@param a[] int, arreglo desordenado
		@return a[] int, arreglo ordenado
	*/

	public int[] selectionSort(int[] a){
		
		for(int i = 0; i < (a.length - 1); i++){
				
			int minimo = i;
			for(int j = i + 1; j < a.length; j++){
			
				if(a[j] < a[minimo]){
					minimo = j; // ! burbuja
				}

			}
			//intercambiar lista[i], lista[minimo]
			int aux = a[i];
			a[i] = a[minimo];
			a[minimo] = aux;
			//método que imprime cada pasoa
		//	System.out.println("Paso : "+ i );
			
			imprime(a);
			
		}

		return a;

	}	


}


