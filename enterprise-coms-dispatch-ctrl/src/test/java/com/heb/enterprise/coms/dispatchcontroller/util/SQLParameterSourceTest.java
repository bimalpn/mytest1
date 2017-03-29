package com.heb.enterprise.coms.dispatchcontroller.util;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SQLParameterSourceTest</code> contains tests for the class
 * <code>{@link SQLParameterSource}</code>.
 * 
 * @generatedBy CodePro at 7/8/13 2:57 PM
 * @author 269118
 * @version $Revision: 1.3 $
 */
public class SQLParameterSourceTest {
	/**
	 * Run the SQLParameterSource() constructor test.
	 * 
	 * @generatedBy CodePro at 7/1/13 5:13 PM
	 */
	@Test
	public void testSQLParameterSource_1() throws Exception {
		SQLParameterSource result = new SQLParameterSource();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Object getValue(String) method test.
	 * 
	 * @throws Exception
	 * @generatedBy CodePro at 7/1/13 5:13 PM
	 */
	@Test
	public void testGetValue_1() throws Exception {
		SQLParameterSource fixture = new SQLParameterSource();
		String arg0 = "";

		Object result = fixture.getValue(arg0);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasValue(String) method test.
	 * 
	 * @throws Exception
	 * @generatedBy CodePro at 7/1/13 5:13 PM
	 */
	@Test
	public void testHasValue_1() throws Exception {
		SQLParameterSource fixture = new SQLParameterSource();
		String arg0 = "";

		boolean result = fixture.hasValue(arg0);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasValue(String) method test.
	 * 
	 * @throws Exception
	 * @generatedBy CodePro at 7/1/13 5:13 PM
	 */
	@Test
	public void testHasValue_2() throws Exception {
		SQLParameterSource fixture = new SQLParameterSource();
		String arg0 = "";

		boolean result = fixture.hasValue(arg0);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Perform pre-test initialization.
	 * 
	 * @throws Exception
	 *             if the initialization fails for some reason
	 * 
	 * @generatedBy CodePro at 7/8/13 2:57 PM
	 */
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 * 
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 * 
	 * @generatedBy CodePro at 7/8/13 2:57 PM
	 */
	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 * 
	 * @param args
	 *            the command line arguments
	 * 
	 * @generatedBy CodePro at 7/8/13 2:57 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SQLParameterSourceTest.class);
	}
}