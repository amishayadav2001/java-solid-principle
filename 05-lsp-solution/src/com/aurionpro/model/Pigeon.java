package com.aurionpro.model;

public class Pigeon implements IFlyable {

	@Override
	public void BodyColor() {
		System.out.println("The body color of pigeon is grey");
		
	}

	@Override
	public void Fly() {
		System.out.println("The pigeon is flying");
		
	}

}
