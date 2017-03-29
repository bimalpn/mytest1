/*package com.heb.enterprise.coms.dispatchcontroller.service;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.message.GenericMessage;

import com.heb.enterprise.coms.dispatchcontroller.util.SpringApplicationContext;
import com.heb.enterprise.coms.dispatchcontroller.vo.TransactionHeaderVO;

*//**
 * The class <code>QNameRefreshServiceTest</code> contains tests for the class
 * <code>{@link QNameRefreshService}</code>.
 * @generatedBy CodePro at 7/8/13 2:57 PM
 * @author 269118
 * @version $Revision: 1.5 $
 *//*
public class QNameRefreshServiceTest {

	*//** The poller. *//*
	private QNameRefreshService poller;

	*//**
	 * Sets the poller.
	 * @param poller
	 *            the new poller
	 *//*
	public void setPoller(QNameRefreshService poller) {
		this.poller = poller;
	}

	*//**
	 * Gets the poller.
	 * @return the poller
	 *//*
	public QNameRefreshService getPoller() {
		return poller;
	}

	*//**
	 * Run the QNameRefreshService() constructor test.
	 * @generatedBy CodePro at 7/8/13 2:57 PM
	 *//*
	@Test
	public void testQNameRefreshService_1() throws Exception {
		QNameRefreshService result = this.getPoller();
		SpringApplicationContext context = null;
		result.setContext(context);
		result.getContext();
		assertNotNull(result);
	}

	*//**
	 * Run the void refreshProperty(Message<?>) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 7/8/13 2:57 PM
	 *//*
	@Test
	public void testRefreshProperty_1() throws Exception {
		try {
			QNameRefreshService fixture = this.getPoller();
			TransactionHeaderVO trxVO = new TransactionHeaderVO();
			trxVO.setQueueName("HEB.COMS.OUTBOUND.ORDER.QUEUE");
			List<TransactionHeaderVO> trxHdrList = new ArrayList<TransactionHeaderVO>();
			trxHdrList.add(trxVO);
			Message<Object> message = new GenericMessage<Object>(trxHdrList);
			fixture.refreshProperty(message);
		} catch (NullPointerException e) {

		}
	}

	*//**
	 * Run the void refreshProperty(Message<?>) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 7/8/13 2:57 PM
	 *//*
	@Test
	public void testRefreshProperty_2() throws Exception {
		try {
			QNameRefreshService fixture = this.getPoller();
			TransactionHeaderVO trxVO = new TransactionHeaderVO();
			trxVO.setQueueName("HEB.COMS.INBOUND.ORDER.QUEUE");
			List<TransactionHeaderVO> trxHdrList = new ArrayList<TransactionHeaderVO>();
			trxHdrList.add(trxVO);
			Message<Object> message = new GenericMessage<Object>(trxHdrList);
			fixture.refreshProperty(message);
		} catch (NullPointerException e) {

		}
	}

	*//**
	 * Perform pre-test initialization.
	 * @throws Exception
	 *             if the initialization fails for some reason
	 * @generatedBy CodePro at 7/8/13 2:57 PM
	 *//*
	@Before
	public void setUp() throws Exception {
		this.setPoller((QNameRefreshService)new ClassPathXmlApplicationContext(
				"/config/service-context.xml").getBean("qNameRefreshService"));
	}

	*//**
	 * Perform post-test clean-up.
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 * @generatedBy CodePro at 7/8/13 2:57 PM
	 *//*
	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	*//**
	 * Launch the test.
	 * @param args
	 *            the command line arguments
	 * @generatedBy CodePro at 7/8/13 2:57 PM
	 *//*
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(QNameRefreshServiceTest.class);
	}
}*/