package main;

import interfaces.MyInterface;
import objetos.MyInterfaceOne;
import objetos.MyInterfaceTwo;

public class Main {

	public static void main(String[] args) {
		MyInterfaceOne e1 = new MyInterfaceOne();
		MyInterfaceTwo e2 = new MyInterfaceTwo();
		
		e1.printHello();
		e2.printHello();
		
		MyInterface.printTest();
		
	}

}
