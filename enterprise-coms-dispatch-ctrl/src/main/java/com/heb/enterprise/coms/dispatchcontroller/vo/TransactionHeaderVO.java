/*
 * $Id: TransactionHeaderVO.java,v 1.3 2017/03/02 05:44:28 vn89873 Exp $
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.dispatchcontroller.vo;

import java.io.Serializable;

/**
 * @author 269118
 */
public class TransactionHeaderVO implements Serializable {

	private static final long serialVersionUID = 7175059510699088690L;

	private String trxHdrId;
	private String srcSystem;
	private String queueName;
	private String status;

	/**
	 * @return the trxHdrId
	 */
	public String getTrxHdrId() {
		return this.trxHdrId;
	}

	/**
	 * @param trxHdrId
	 *            the trxHdrId to set
	 */
	public void setTrxHdrId(final String trxHdrId) {
		this.trxHdrId = trxHdrId;
	}

	/**
	 * @return the srcSystem
	 */
	public String getSrcSystem() {
		return this.srcSystem;
	}

	/**
	 * @param srcSystem
	 *            the srcSystem to set
	 */
	public void setSrcSystem(final String srcSystem) {
		this.srcSystem = srcSystem;
	}

	/**
	 * @return the queueName
	 */
	public String getQueueName() {
		return this.queueName;
	}

	/**
	 * @param queueName
	 *            the queueName to set
	 */
	public void setQueueName(final String queueName) {
		this.queueName = queueName;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
}
