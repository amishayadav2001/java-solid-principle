package com.aurionpro.model;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot starts working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stops working");
	}

	@Override
	public void eat() {
		System.out.println("robot eats");
	}

	@Override
	public void drink() {
		System.out.println("Robot drinks");
	}

}
