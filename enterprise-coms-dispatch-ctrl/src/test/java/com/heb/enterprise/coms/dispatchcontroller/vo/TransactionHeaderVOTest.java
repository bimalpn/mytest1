package com.heb.enterprise.coms.dispatchcontroller.vo;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TransactionHeaderVOTest</code> contains tests for the class
 * <code>{@link TransactionHeaderVO}</code>.
 * 
 * @generatedBy CodePro at 7/8/13 2:57 PM
 * @author 269118
 * @version $Revision: 1.3 $
 */
public class TransactionHeaderVOTest {
	/**
	 * Run the TransactionHeaderVO() constructor test.
	 * 
	 * @generatedBy CodePro at 7/1/13 4:57 PM
	 */
	@Test
	public void testTransactionHeaderVO_1() throws Exception {
		TransactionHeaderVO result = new TransactionHeaderVO();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getQueueName() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 7/1/13 4:57 PM
	 */
	@Test
	public void testGetQueueName_1() throws Exception {
		TransactionHeaderVO fixture = new TransactionHeaderVO();
		fixture.setQueueName("");
		fixture.setSrcSystem("");
		fixture.setTrxHdrId("");

		String result = fixture.getQueueName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSrcSystem() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 7/1/13 4:57 PM
	 */
	@Test
	public void testGetSrcSystem_1() throws Exception {
		TransactionHeaderVO fixture = new TransactionHeaderVO();
		fixture.setQueueName("");
		fixture.setSrcSystem("");
		fixture.setTrxHdrId("");

		String result = fixture.getSrcSystem();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTrxHdrId() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 7/1/13 4:57 PM
	 */
	@Test
	public void testGetTrxHdrId_1() throws Exception {
		TransactionHeaderVO fixture = new TransactionHeaderVO();
		fixture.setQueueName("");
		fixture.setSrcSystem("");
		fixture.setTrxHdrId("");

		String result = fixture.getTrxHdrId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setQueueName(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 7/1/13 4:57 PM
	 */
	@Test
	public void testSetQueueName_1() throws Exception {
		TransactionHeaderVO fixture = new TransactionHeaderVO();
		fixture.setQueueName("");
		fixture.setSrcSystem("");
		fixture.setTrxHdrId("");
		String queueName = "";

		fixture.setQueueName(queueName);

		// add additional test code here
	}

	/**
	 * Run the void setSrcSystem(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 7/1/13 4:57 PM
	 */
	@Test
	public void testSetSrcSystem_1() throws Exception {
		TransactionHeaderVO fixture = new TransactionHeaderVO();
		fixture.setQueueName("");
		fixture.setSrcSystem("");
		fixture.setTrxHdrId("");
		String srcSystem = "";

		fixture.setSrcSystem(srcSystem);

		// add additional test code here
	}

	/**
	 * Run the void setTrxHdrId(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 7/1/13 4:57 PM
	 */
	@Test
	public void testSetTrxHdrId_1() throws Exception {
		TransactionHeaderVO fixture = new TransactionHeaderVO();
		fixture.setQueueName("");
		fixture.setSrcSystem("");
		fixture.setTrxHdrId("");
		String trxHdrId = "";

		fixture.setTrxHdrId(trxHdrId);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(TransactionHeaderVOTest.class);
	}
}