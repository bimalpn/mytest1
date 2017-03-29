/*
 * $Id: SpringApplicationContext.java,v 1.5 2017/03/02 05:44:15 vn89873 Exp $
 *
 * Copyright (c) 2010 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.dispatchcontroller.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Wrapper to always return a reference to the Spring Application Context from
 * within non-Spring enabled beans. Unlike Spring MVC's
 * WebApplicationContextUtils we do not need a reference to the Servlet context
 * for this. All we need is for this bean to be initialized during application
 * startup.
 * @author 269118
 */
public class SpringApplicationContext implements ApplicationContextAware {

	private ConfigurableApplicationContext context;

	/**
	 * This method is called from within the ApplicationContext once it is done
	 * starting up, it will stick a reference to itself into this bean.
	 *
	 * @param applContext a reference to the ApplicationContext.
	 */
	@Override
	public void setApplicationContext(final ApplicationContext applContext){
		if (applContext instanceof ConfigurableApplicationContext) {
			this.context = (ConfigurableApplicationContext)applContext;
		}
	}

	/**
	 * This is about the same as context.getBean("beanName"), except it has its
	 * own static handle to the Spring context, so calling this method
	 * statically will give access to the beans by name in the Spring
	 * application context. As in the context.getBean("beanName") call, the
	 * caller must cast to the appropriate target class. If the bean does not
	 * exist, then a Runtime error will be thrown.
	 * @param beanName
	 *            the name of the bean to get.
	 * @return an Object reference to the named bean.
	 */
	public Object getBean(final String beanName) {
		return this.context.getBean(beanName);
	}

	/**
	 * To refresh the Application Context.
	 */
	public void refresh() {
		final Thread refreshThread = new Thread() {
			@Override
			public void run() {
				SpringApplicationContext.this.context.refresh();
			}
		};
		refreshThread.start();
	}
}
