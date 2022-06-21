package org.bike;

public class Ktm implements Bike{

	@Override
	public void cost() {
		System.out.println("Cost of the bike----160000");
		
	}

	@Override
	public void speed() {
		System.out.println("Speed of the bike----80km/hr");
		
	}

	public static void main(String[] args) {
		
		Ktm k=new Ktm();
		k.cost();
		k.speed();
	}
}
