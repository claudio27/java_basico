package ordenamiento;

public class Main{

public static void main(String []args){

// objeto de la clase que ordena
Ordenado ord = new Ordenado();

int[] a = ord.crea(12);

ord.imprime(a);

int[] b = ord.selectionSort(a);

ord.imprime(b);


}

}
