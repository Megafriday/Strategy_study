package ducks.ducks;

import ducks.wings.RabberWings;

public class RabberDuck extends AbstractDuck {

	public RabberDuck() {
		ifWings = new RabberWings();
	}

	@Override
	public void display() {
		System.out.println("これは、ラバーダッグです。");

	}

}
