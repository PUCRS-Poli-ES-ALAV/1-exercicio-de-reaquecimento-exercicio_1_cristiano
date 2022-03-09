package br.pucrs.alav;

import java.util.List;

public class Recursion {
	
	private String[] alphabet = {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
			"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
			};
	
	public long mult(long a, long b) {
		if(a <= 0) return 0;
		if(b <= 0) return 0;

		return a + mult(a, --b);
	}
	
	public long sum(long a, long b) {
		return sumAux(a) + sumAux(b);
	}
	private long sumAux(long n){
		if(n <=0) return 0;

		return 1 + sumAux(--n);
	}
	
	public double sumFraction(long n) {
		return 0;
	}
	
	
	public String invert(String txt) {
		return txt;
	}
	
	public long sequence(long n) {
		return 0;
	}
	
	public long ackerman(long m, long n) {
		return 0;
	}
	
	public int product(long[] values) {
		return 0;
	}
	
	public boolean isPalindrome(String word) {
		return false;
	}
	
	public List<String> alphaSequence(int n){
		return null;
	}
	
	public long fibonacci(int f0, int f1) {
		return 0;
	}
	
}
