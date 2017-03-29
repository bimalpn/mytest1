package com.heb.enterprise.coms.dispatchcontroller.util;

import static org.junit.Assert.assertNotNull;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>DispatcherCtrlConstanstsTest</code> contains tests for the
 * class <code>{@link DispatcherCtrlConstansts}</code>.
 * @generatedBy CodePro at 7/8/13 5:39 PM
 * @author 269118
 * @version $Revision: 1.5 $
 */
public class DispatcherCtrlConstanstsTest {

	/**
	 * Run the SQLParameterSource() constructor test.
	 * @generatedBy CodePro at 7/1/13 5:13 PM
	 */
	@Test
	public void testDispatcherCtrlConstansts() throws Exception {
		try {
			Constructor<DispatcherCtrlConstansts> c = DispatcherCtrlConstansts.class
					.getDeclaredConstructor();
			c.setAccessible(true);
			DispatcherCtrlConstansts obj = c.newInstance();
			assertNotNull(obj);
		} catch (InvocationTargetException e) {
			//e.printStackTrace();
		}
	}

	/**
	 * Perform pre-test initialization.
	 * @throws Exception
	 *             if the initialization fails for some reason
	 * @generatedBy CodePro at 7/8/13 5:39 PM
	 */
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 * @generatedBy CodePro at 7/8/13 5:39 PM
	 */
	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 * @param args
	 *            the command line arguments
	 * @generatedBy CodePro at 7/8/13 5:39 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore()
				.run(DispatcherCtrlConstanstsTest.class);
	}
}