package com.gmail.ptimofejev;

public class Main {

	public static void main(String[] args) {
		Thread[] threads = new Thread[100];

		for (int i = 0; i < threads.length; i++) {
			FactorialTask factTask = new FactorialTask(i);
			threads[i] = new Thread(factTask);
			threads[i].start();
		}
	}

}
