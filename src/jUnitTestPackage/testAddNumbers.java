package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions JUnit=new jUnitFunctions();
		@SuppressWarnings("static-access")
		int result = JUnit.addTwoNum(100, 200);
		assertEquals(300, result);
	}

}