package ducks.ducks;

import ducks.wings.RealWings;

public class MallardDuck extends AbstractDuck {


	public MallardDuck() {
		ifWings = new RealWings();
	}

	@Override
	public void display() {
		System.out.println("これは、マガモです。");

	}

}
