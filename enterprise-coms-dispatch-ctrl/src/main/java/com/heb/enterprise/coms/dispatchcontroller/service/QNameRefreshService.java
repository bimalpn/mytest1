/*
 * $Id: QNameRefreshService.java,v 1.7 2017/03/02 05:44:05 vn89873 Exp $
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.dispatchcontroller.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;

import com.heb.enterprise.coms.dispatchcontroller.util.DispatcherCtrlConstansts;
import com.heb.enterprise.coms.dispatchcontroller.util.SpringApplicationContext;
import com.heb.enterprise.coms.dispatchcontroller.vo.TransactionHeaderVO;

/**
 * @author 269118
 */
public class QNameRefreshService {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(QNameRefreshService.class);
	private static Properties comsProperties = new Properties();
	private static String comsProps = "";

	@Autowired
	private SpringApplicationContext context;

	/**
	 * To refresh the property file.
	 * @param message
	 *            message
	 */
	public void refreshProperty(final Message<?> message) {
		final String path = this.getClass()
				.getResource(DispatcherCtrlConstansts.SLASH).getFile();
		String decoded = "";
		try {
			decoded = URLDecoder.decode(path, "UTF-8");
			// QNameRefreshService.LOGGER.debug("path : " + decoded);
			this.getFileLocation("ecom.properties", decoded);
			final String oldQueue = this.getQueueName();
			@SuppressWarnings("unchecked")
			final List<TransactionHeaderVO> messagePayload = (List<TransactionHeaderVO>)message
					.getPayload();
			final String newQueue = messagePayload.get(0).getQueueName();
			if (!newQueue.equalsIgnoreCase(oldQueue)) {
				this.writeProperty(DispatcherCtrlConstansts.QUEUE_NAME,
						newQueue);
				QNameRefreshService.LOGGER.debug("Old QName : " + oldQueue +
						" New QName : " + newQueue);
				this.context.refresh();
			}
		} catch (final UnsupportedEncodingException e) {
			QNameRefreshService.LOGGER.error("UnsupportedEncodingException : " +
					e);
		} catch (final IOException e) {
			QNameRefreshService.LOGGER.error("IOException : " + e);
		}
	}

	/**
	 * To write a property into property file.
	 * @param propertyName
	 *            propertyName
	 * @param value
	 *            value
	 * @throws IOException
	 *             IOException
	 */
	private void writeProperty(final String propertyName, final String value)
			throws IOException {
		QNameRefreshService.comsProperties.setProperty(propertyName, value);
		final FileOutputStream fileOutputStream = new FileOutputStream(
				QNameRefreshService.comsProps);
		QNameRefreshService.comsProperties.store(fileOutputStream, "");
		fileOutputStream.close();
	}

	/**
	 * To get file Location.
	 * @param fileName
	 *            fileName
	 * @param requestPath
	 *            requestPath
	 */
	private void getFileLocation(final String fileName, final String requestPath) {
		final String fileLocation = requestPath + "properties/" + fileName;
		QNameRefreshService.comsProps = fileLocation;
	}

	/**
	 * To Read Queue Name.
	 * @return String
	 * @throws IOException
	 *             IOException
	 */
	private String getQueueName() throws IOException {
		final FileInputStream fileInputStream = new FileInputStream(
				QNameRefreshService.comsProps);
		QNameRefreshService.comsProperties.load(fileInputStream);
		final String queueName = QNameRefreshService.comsProperties
				.getProperty(DispatcherCtrlConstansts.QUEUE_NAME);
		fileInputStream.close();
		return queueName;
	}

	/**
	 * @return the context
	 */
	public SpringApplicationContext getContext() {
		return this.context;
	}

	/**
	 * @param context
	 *            the context to set
	 */
	public void setContext(final SpringApplicationContext context) {
		this.context = context;
	}
}
