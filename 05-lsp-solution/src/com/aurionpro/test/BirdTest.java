package com.aurionpro.test;

import com.aurionpro.model.Ostrich;
import com.aurionpro.model.Pigeon;
import com.aurionpro.model.Sparrow;

public class BirdTest {
	public static void main(String[] args) {
		Ostrich ostrich = new Ostrich();
		ostrich.BodyColor();
		ostrich.Walk();
		System.out.println();

		Pigeon pigeon = new Pigeon();
		pigeon.BodyColor();
		pigeon.Fly();
		System.out.println();

		Sparrow sparrow = new Sparrow();
		sparrow.BodyColor();
		sparrow.Fly();
	}
}
