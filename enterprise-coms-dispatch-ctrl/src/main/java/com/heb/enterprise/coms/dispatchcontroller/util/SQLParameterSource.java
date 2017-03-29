/*
 * $Id: SQLParameterSource.java,v 1.6 2017/03/02 05:44:15 vn89873 Exp $
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.dispatchcontroller.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.AbstractSqlParameterSource;

/**
 * @author 269118
 */
public class SQLParameterSource extends AbstractSqlParameterSource {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory
			.getLogger(SQLParameterSource.class);

	/** The host name. */
	private final String hostName = this.getHostName();

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.springframework.jdbc.core.namedparam.SqlParameterSource#getValue(
	 * java.lang.String)
	 */
	@Override
	public Object getValue(final String arg0) {
		return this.hostName;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.springframework.jdbc.core.namedparam.SqlParameterSource#hasValue(
	 * java.lang.String)
	 */
	@Override
	public boolean hasValue(final String arg0) {
		return !this.hostName.isEmpty();
	}

	/**
	 * To get the HostName.
	 * @return string
	 */
	private String getHostName() {
		String hostNm = null;
		try {
			// Fetches the host name of the current instance using InetAddress
			hostNm = InetAddress.getLocalHost().getHostName();
			System.out.println("Host Name:" + hostNm);
			SQLParameterSource.LOGGER.debug("Host Name : " + hostNm);
		} catch (final UnknownHostException e) {
			// If system is not able to identify the host an exception will be
			// logged
			SQLParameterSource.LOGGER.debug("UnknownHostException : ", e);
		}
		return hostNm;
	}
}
