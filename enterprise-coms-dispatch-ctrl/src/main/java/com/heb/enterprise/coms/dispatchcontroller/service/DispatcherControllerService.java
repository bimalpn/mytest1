/*
 * $Id: DispatcherControllerService.java,v 1.5 2017/03/02 05:44:05 vn89873 Exp $
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.dispatchcontroller.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;

import com.heb.enterprise.coms.dispatchcontroller.util.DispatcherCtrlConstansts;
import com.heb.enterprise.coms.dispatchcontroller.vo.TransactionHeaderVO;

/**
 * The Class DispatcherControllerService.
 *
 * @author 269118
 */
public class DispatcherControllerService {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory
			.getLogger(DispatcherControllerService.class);

	/**
	 * To process the Event Header Records.
	 * @param message
	 *            message
	 * @return Map<String, String>
	 */
	@SuppressWarnings("unchecked")
	public List<Map<String, Integer>> dispatchHeaderIds(final Message<?> message) {
		DispatcherControllerService.LOGGER.trace("dispatchHeaderIds starts");
		// List of Transactions obtained from polling DB
		final List<TransactionHeaderVO> trxList = (List<TransactionHeaderVO>)message
				.getPayload();
		// Creating a list of map to be sent to the next channel in spring
		// integration
		final List<Map<String, Integer>> mapList = new ArrayList<Map<String, Integer>>();
		for (final TransactionHeaderVO trxVO : trxList) {
			if("DSPTD".equals(trxVO.getStatus())){
				final Map<String, Integer> trxIdMap = this.createNewHashMap();
				DispatcherControllerService.LOGGER.info("Trx ID Dispatched : " +
						trxVO.getTrxHdrId());
				// The key of the map is - trxHdrId and value is the transaction
				// header id fetched from db
				trxIdMap.put(DispatcherCtrlConstansts.TRX_HDR_ID,
						Integer.parseInt(trxVO.getTrxHdrId().trim()));
				mapList.add(trxIdMap);
			}
		}
		DispatcherControllerService.LOGGER.debug("Record Count : " +
				trxList.size());
		DispatcherControllerService.LOGGER.trace("dispatchHeaderIds ends");
		return mapList;
	}

	/**
	 * Creates the new hash map.
	 * @return the map
	 */
	private Map<String, Integer> createNewHashMap() {
		return new HashMap<String, Integer>();
	}

	/**
	 * To Split Trx Hdr Ids's.
	 * @param message
	 *            message
	 * @return Object
	 */
	public List<Integer> split(final List<Map<String, Integer>> message) {
		// This is a spring integration message splitter component which will
		// split the messages to be sent to the next channel
		DispatcherControllerService.LOGGER.trace("split method starts");
		final List<Integer> trxHdrIdList = new ArrayList<Integer>();
		// Retrieves the list of transaction header ids from the map
		for (final Map<String, Integer> trxIdMap : message) {
			final Integer result = trxIdMap
					.get(DispatcherCtrlConstansts.TRX_HDR_ID);
			DispatcherControllerService.LOGGER.debug("trxHdrId: " + result);
			// Extracts the transaction ID from the map and puts in a list to be
			// sent to the next component in spring integration
			trxHdrIdList.add(result);
		}
		DispatcherControllerService.LOGGER.debug("trxHdrIdList size: " +
				trxHdrIdList.size());
		DispatcherControllerService.LOGGER.trace("split method ends");
		return trxHdrIdList;
	}
	
	public void handleError(final Message<?> errorMessage){
		System.out.println(errorMessage.getPayload());
		
	}
}
