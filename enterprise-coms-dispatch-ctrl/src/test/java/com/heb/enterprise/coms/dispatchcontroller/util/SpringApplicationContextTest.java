package com.heb.enterprise.coms.dispatchcontroller.util;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The class <code>SpringApplicationContextTest</code> contains tests for the
 * class <code>{@link SpringApplicationContext}</code>.
 * @generatedBy CodePro at 7/8/13 2:57 PM
 * @author 269118
 * @version $Revision: 1.5 $
 */
public class SpringApplicationContextTest {
	/**
	 * Run the Object getBean(String) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 7/1/13 5:13 PM
	 */
	@Test
	public void testGetBean_1() throws Exception {
		try {
			String beanName = "context";
			SpringApplicationContext context = new SpringApplicationContext();
			Object result = context.getBean(beanName);
			assertNotNull(result);
		} catch (Exception e) {

		}
	}

	/**
	 * Run the void refresh() method test.
	 * @throws Exception
	 * @generatedBy CodePro at 7/1/13 5:13 PM
	 */
	@Test
	public void testRefresh_1() throws Exception {
		SpringApplicationContext context = new SpringApplicationContext();
		context.refresh();
	}

	/**
	 * Run the void setApplicationContext(ApplicationContext) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 7/1/13 5:13 PM
	 */
	@Test
	public void testSetApplicationContext_1() throws Exception {
		SpringApplicationContext fixture = new SpringApplicationContext();
		ApplicationContext applContext = new ClassPathXmlApplicationContext();
		fixture.setApplicationContext(applContext);
	}

	/**
	 * Run the void setApplicationContext(ApplicationContext) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 7/1/13 5:13 PM
	 */
	@Test
	public void testSetApplicationContext_2() throws Exception {
		SpringApplicationContext fixture = new SpringApplicationContext();
		ApplicationContext applContext = new ClassPathXmlApplicationContext();
		fixture.setApplicationContext(applContext);
	}

	/**
	 * Perform pre-test initialization.
	 * @throws Exception
	 *             if the initialization fails for some reason
	 * @generatedBy CodePro at 7/8/13 2:57 PM
	 */
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 * @generatedBy CodePro at 7/8/13 2:57 PM
	 */
	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 * @param args
	 *            the command line arguments
	 * @generatedBy CodePro at 7/8/13 2:57 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore()
				.run(SpringApplicationContextTest.class);
	}
}