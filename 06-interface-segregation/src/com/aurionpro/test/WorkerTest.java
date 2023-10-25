package com.aurionpro.test;

import com.aurionpro.model.IWorker;
import com.aurionpro.model.Labour;
import com.aurionpro.model.Robot;

public class WorkerTest {

	public static void main(String[] args) {
		IWorker labour = new Labour();
		labour.startWork();
		
		IWorker robo = new Robot();
		robo.startWork();

	}

}
