/*
 * $Id: DispatcherCtrlConstansts.java,v 1.5 2017/03/02 05:44:15 vn89873 Exp $
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.dispatchcontroller.util;

/**
 * @author 269118
 */
public final class DispatcherCtrlConstansts {

	/**
	 * Constants.
	 */
	public static final String SLASH = "/";
	/**
	 * Constants.
	 */
	public static final String QUEUE_NAME = "QUEUE.NAME";

	/**
	 * Constants.
	 */
	public static final String TRX_HDR_ID = "trxHdrId";


	/**
	 * prevents calls from subclass.
	 */
	private DispatcherCtrlConstansts() {
		// prevents calls from subclass
		throw new UnsupportedOperationException();
	}

}
