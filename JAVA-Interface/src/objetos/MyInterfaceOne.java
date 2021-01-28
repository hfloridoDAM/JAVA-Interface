package objetos;

import interfaces.MyInterface;

public class MyInterfaceOne implements MyInterface{
	
	public MyInterfaceOne() {
		
	}

	@Override
	public void printHello() {
		System.out.println("Hola");
	}

	@Override
	public void printWorld(String value) {
		System.out.println("Mundo");
		
	}

	@Override
	public boolean isReturn() {
		return false;
	}

}
