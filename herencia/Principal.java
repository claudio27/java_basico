package herencia;

public class Principal{

	public static void main(String []args)
	{

		Padre papa = new Padre();
		papa.saluda();

		Hijo juan = new Hijo();
		juan.saludaHijo();

		// polimorfismo, el padre puede usar métodos de la clase hija, que hereda
 //que mierd que no funciona ahora
		
		papa = juan;

		papa.saludaHijo();

	}

} 