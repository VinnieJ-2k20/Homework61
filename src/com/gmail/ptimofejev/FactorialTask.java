package com.gmail.ptimofejev;

import java.math.BigInteger;

public class FactorialTask implements Runnable {
	private int number;

	public FactorialTask(int number) {
		this.number = number;
	}
	
	public BigInteger factorial(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(new BigInteger(Integer.toString(i)));
		}
		return fact;
	}
	
	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		System.out.println(thr.getName() + ": " + number + "! = " + factorial(number));
	}
}
