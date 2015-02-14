package herencia;

public class Hijo extends Padre{

	public String tipo = "Hijo";


	public void saludaHijo(){

		System.out.println("Hola yo soy el :" + this.tipo);

	}

	public void holaPolimorfico(){

		System.out.println("Hola este es un saludo polimorfico ");
	}
}