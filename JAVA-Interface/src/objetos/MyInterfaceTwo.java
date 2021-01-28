package objetos;

import interfaces.MyInterface;

public class MyInterfaceTwo implements MyInterface {

	@Override
	public void printHello() {
		System.out.println("Hello");
	}

	@Override
	public void printWorld(String value) {
		System.out.println("World");
	}

	@Override
	public boolean isReturn() {
		return true;
	}

}
