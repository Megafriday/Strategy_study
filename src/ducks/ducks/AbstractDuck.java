package ducks.ducks;

import ducks.wings.IFWings;

public abstract class AbstractDuck {

	protected IFWings ifWings;

	public void fly() {
		ifWings.fly();
	}

	public void swim() {
		System.out.println("全てのダッグは、泳げます");
	}

	public abstract void display();
}
