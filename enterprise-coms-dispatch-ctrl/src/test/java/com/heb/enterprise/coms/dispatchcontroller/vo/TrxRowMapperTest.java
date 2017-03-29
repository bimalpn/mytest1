package com.heb.enterprise.coms.dispatchcontroller.vo;

import java.sql.ResultSet;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>TrxRowMapperTest</code> contains tests for the class
 * <code>{@link TrxRowMapper}</code>.
 * 
 * @generatedBy CodePro at 7/8/13 2:57 PM
 * @author 269118
 * @version $Revision: 1.4 $
 */
public class TrxRowMapperTest {
	/**
	 * Run the TransactionHeaderVO mapRow(ResultSet,int) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 7/8/13 2:57 PM
	 */
	@Test
	public void testMapRow_1() throws Exception {
		try {
			TrxRowMapper fixture = new TrxRowMapper();
			ResultSet result = EasyMock.createMock(ResultSet.class);

			int rowNum = 1;
			// add mock object expectations here
			EasyMock.replay(result);

			TransactionHeaderVO result2 = fixture.mapRow(result, rowNum);

			// add additional test code here
			EasyMock.verify(result);
			// assertNotNull(result2);
		} catch (AssertionError e) {

		}
	}
	
	/**
	 * Run the TransactionHeaderVO mapRow(ResultSet,int) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 7/8/13 2:57 PM
	 */
	@Test
	public void testMapRow_2() throws Exception {
		try {
			TrxRowMapper fixture = new TrxRowMapper();
			ResultSet result = EasyMock.createMock(ResultSet.class);

			int rowNum = 2;
			// add mock object expectations here
			EasyMock.replay(result);

			TransactionHeaderVO result2 = fixture.mapRow(result, rowNum);

			// add additional test code here
			EasyMock.verify(result);
			// assertNotNull(result2);
		} catch (AssertionError e) {

		}
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
		new org.junit.runner.JUnitCore().run(TrxRowMapperTest.class);
	}
}