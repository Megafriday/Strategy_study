package ducks;

import ducks.ducks.AbstractDuck;
import ducks.ducks.MallardDuck;
import ducks.ducks.RabberDuck;

public class Main {

	public static void main(String[] args) {
		AbstractDuck aDuck = new MallardDuck();
		aDuck.display();
		aDuck.swim();
		aDuck.fly();


		System.out.println("----------------------------------------");

		AbstractDuck bDuck = new RabberDuck();
		bDuck.display();
		bDuck.swim();
		bDuck.fly();

	}

}
