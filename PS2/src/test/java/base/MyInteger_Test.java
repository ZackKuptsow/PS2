package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	//Tests all even classes
	public void evenTest() {
		@SuppressWarnings("unused") //Used in another class
		MyInteger iValue = new MyInteger(2);
		assertTrue(MyInteger.isEven());
		
		assertTrue(MyInteger.isEven(4));
		
		MyInteger integer = new MyInteger(8);
		assertTrue(MyInteger.isEven(integer));
	}
	
	@Test
	//Tests all odd classes
	public void oddTest(){
		@SuppressWarnings("unused") //Used in another class
		MyInteger iValue = new MyInteger(3);
		assertTrue(MyInteger.isOdd());
		
		assertTrue(MyInteger.isOdd(5));
		
		MyInteger integer = new MyInteger(9);
		assertTrue(MyInteger.isOdd(integer));
	}
	
	@Test
	//Tests all prime classes
	public void primeTest(){
		@SuppressWarnings("unused") //Used in another class
		MyInteger iValue = new MyInteger(7);
		assertTrue(MyInteger.isPrime());
		
		assertTrue(MyInteger.isPrime(3));
		
		MyInteger integer = new MyInteger(11);
		assertTrue(MyInteger.isPrime(integer));
	}
	
	
	//Tests all equal classes
	public void equalTest(){
		@SuppressWarnings("unused") //Used in another class
		MyInteger newValue = new MyInteger(12);
		assertTrue(MyInteger.isEqual(12));
		
		MyInteger integer = new MyInteger(12);
		assertTrue(MyInteger.isEqual(integer));
	}
}
