package com.aurionpro.model;

public class Loader implements IWorker {

	@Override
	public void start() {
		System.out.println("Start");
	}

	@Override
	public void stop() {
		System.out.println("Stop");
	}

	@Override
	public void eat() {
		System.out.println("Eat");
	}

	@Override
	public void rest() {
		System.out.println("Rest");
	}

}
