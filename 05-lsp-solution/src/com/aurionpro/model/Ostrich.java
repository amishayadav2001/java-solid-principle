package com.aurionpro.model;

public class Ostrich implements INonFlyable {

	@Override
	public void BodyColor() {
		System.out.println("The body color of ostrich is white");
	}

	@Override
	public void Walk() {
		System.out.println("Ostrich is walking");
	}

}
