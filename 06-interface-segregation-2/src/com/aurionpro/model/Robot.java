package com.aurionpro.model;

public class Robot implements IWorkable {

	@Override
	public void start() {
		System.out.println("Start");
	}

	@Override
	public void stop() {
		System.out.println("Stop");
	}

}
