/*package com.heb.enterprise.coms.dispatchcontroller.service;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.integration.Message;
import org.springframework.integration.message.GenericMessage;

import com.heb.enterprise.coms.dispatchcontroller.vo.TransactionHeaderVO;

*//**
 * The class <code>DispatcherControllerServiceTest</code> contains tests for the
 * class <code>{@link DispatcherControllerService}</code>.
 * @generatedBy CodePro at 7/8/13 2:56 PM
 * @author 269118
 * @version $Revision: 1.5 $
 *//*
public class DispatcherControllerServiceTest {
	*//**
	 * Run the DispatcherControllerService() constructor test.
	 * @generatedBy CodePro at 7/8/13 2:56 PM
	 *//*
	@Test
	public void testDispatcherControllerService_1() throws Exception {
		DispatcherControllerService result = new DispatcherControllerService();
		assertNotNull(result);
	}

	*//**
	 * Run the List<Map<String, Integer>> dispatchHeaderIds(Message<?>) method
	 * test.
	 * @throws Exception
	 * @generatedBy CodePro at 7/8/13 2:56 PM
	 *//*
	@Test
	public void testDispatchHeaderIds_1() throws Exception {
		DispatcherControllerService fixture = new DispatcherControllerService();
		List<Object> payload = new ArrayList<Object>();
		TransactionHeaderVO vo = new TransactionHeaderVO();
		vo.setQueueName("test");
		vo.setSrcSystem("test");
		vo.setTrxHdrId("0");
		payload.add(vo);
		Message<Object> message = new GenericMessage<Object>(payload);
		List<Map<String, Integer>> result = fixture.dispatchHeaderIds(message);
		assertNotNull(result);
	}

	*//**
	 * Run the List<Integer> split(List<Map<String,Integer>>) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 7/8/13 2:56 PM
	 *//*
	@Test
	public void testSplit_1() throws Exception {
		DispatcherControllerService fixture = new DispatcherControllerService();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("trxHdrId", 1);
		List<Map<String, Integer>> message = new ArrayList<Map<String, Integer>>();
		message.add(map);
		List<Integer> result = fixture.split(message);
		assertNotNull(result);		
	}

	*//**
	 * Perform pre-test initialization.
	 * @throws Exception
	 *             if the initialization fails for some reason
	 * @generatedBy CodePro at 7/8/13 2:56 PM
	 *//*
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}

	*//**
	 * Perform post-test clean-up.
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 * @generatedBy CodePro at 7/8/13 2:56 PM
	 *//*
	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	*//**
	 * Launch the test.
	 * @param args
	 *            the command line arguments
	 * @generatedBy CodePro at 7/8/13 2:56 PM
	 *//*
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore()
				.run(DispatcherControllerServiceTest.class);
	}
}*/