package herencia2;

/**
Polimorfismo es la capacidad de un objeto de adquirir varias formas. El uso más común de polimorfismo en programación orientada a objetos se da cuando se utiliza la referencia de una clase padre, para referirse al objeto de la clase hijo.

Cualquier objeto java que pueda pasar más de un test "ES-UN" es considerado polimórfico. En Java, todos los objetos son polimórficos ya que cualquier objeto pasaría un test "ES-UN" dado que son de su propio tipo, además del de la clase Object.

Es importante saber que la única manera de acceder a un objeto es a través de una variable de referencia. La variable de referencia sólo puede ser de un tipo. Una vez declarado el tipo de la variable de referencia, no se puede cambiar.

La variable de referencia puede ser reasignada a otros objetos, siempre y cuando no haya sido declarada "final". El tipo de la variable de referencia, determina los métodos que podrán ser llamados sobre el objeto.

Una variable de referencia puede hacer referencia a cualquier objeto o cualquier subtipo de su propio tipo.
*/
public class Principal {
	public static void main(String[] args) {
		B[] bs = new B[3];
		bs[0] = new B();
		bs[1] = new A();
		bs[2] = new C();
		//naivePrinter(bs);

		bs[1].print();

	}

	private static void naivePrinter(B[] bs) {
		for (int i = 0; i < bs.length; i++) {
			bs[i].print();
		}

	}
}
