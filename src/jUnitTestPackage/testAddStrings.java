package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions JUnit=new jUnitFunctions();
		@SuppressWarnings("static-access")
		String result = JUnit.addTwoStr("software", "engineering");
		assertEquals("softwareengineering", result);
	}

}