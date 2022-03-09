package br.pucrs.alav;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RecursionTests {

	@Test
	public void test() { 
		assertTrue("Ser�?", true);
	}
	
	@Test
	public void testMul() {
		Recursion recursion = new Recursion();
		assertEquals(56L, recursion.mult(7, 8));
	}
	
	@Test
	public void testSum() {
		Recursion recursion = new Recursion();
		assertEquals(7L, recursion.sum(3, 4));
	}
	
	@Test
	public void testCalcFrac() {
		assertTrue(false);
	}
	
	@Test
	public void testInvert() {
		assertTrue(false);
	}
	
	@Test
	public void testSequence() {
		assertTrue(false);
	}
	
	@Test
	public void testAckerman() {
		assertTrue(false);
	}
	
	@Test
	public void testVecProduct() {
		assertTrue(false);
	}
	
	@Test
	public void testPalindromo() {
		assertTrue(false);
	}
	
	@Test
	public void testAlphaCombination() {
		assertTrue(false);
	}
	
	@Test
	public void testFibonacci() {
		assertTrue(false);
	}
	
}
