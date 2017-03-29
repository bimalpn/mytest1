/*
 * $Id: TrxRowMapper.java,v 1.3 2017/03/02 05:44:28 vn89873 Exp $
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.dispatchcontroller.vo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;

/**
 * The Class TrxRowMapper.
 * @author 269118
 */
public class TrxRowMapper implements RowMapper<TransactionHeaderVO> {
	
	private Map<String, List<String>> orderTrxMap;
	
	private Timestamp batchTs;
	
	

	/**
	 * Gets the order trx map.
	 *
	 * @return the order trx map
	 */
	public Map<String, List<String>> getOrderTrxMap() {
		return orderTrxMap;
	}



	/**
	 * Sets the order trx map.
	 *
	 * @param orderTrxMap the order trx map
	 */
	public void setOrderTrxMap(Map<String, List<String>> orderTrxMap) {
		this.orderTrxMap = orderTrxMap;
	}



	/**
	 * Gets the batch ts.
	 *
	 * @return the batch ts
	 */
	public Timestamp getBatchTs() {
		return batchTs;
	}



	/**
	 * Sets the batch ts.
	 *
	 * @param batchTs the new batch ts
	 */
	public void setBatchTs(Timestamp batchTs) {
		this.batchTs = batchTs;
	}


	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet,
	 * int)
	 */
	@Override
	public TransactionHeaderVO mapRow(final ResultSet result, final int rowNum)
			throws SQLException {
		// The transaction row mapper is used to map the data fetched from the
		// DB poller
		Timestamp currBatTs = result.getTimestamp("batchTs");
		if(this.getBatchTs()==null || (this.getBatchTs()!=null && this.getBatchTs().getTime()!=currBatTs.getTime())){
			this.setBatchTs(currBatTs);
			this.setOrderTrxMap(new HashMap<String,List<String>>());
		}
		
		String skipTrxs = result.getString("skippableTrxns");
		List<String> skipTrxList = Arrays.asList(skipTrxs.split(","));
		String srcTrxTypNm = result.getString("srcTrxTypNm");
		String logicKeyVal = result.getString("logicKeyVal");
		String status = "DSPTD";
		if(skipTrxList.contains(srcTrxTypNm) && this.getOrderTrxMap()!=null && !this.getOrderTrxMap().isEmpty() && this.getOrderTrxMap().get(logicKeyVal)!=null){
			List<String> procdSrcTrxs = this.getOrderTrxMap().get(logicKeyVal);
			if(procdSrcTrxs!=null && procdSrcTrxs.contains(srcTrxTypNm)){
				status = "IGN";
			}
		}else{
			if(this.getOrderTrxMap().get(logicKeyVal)!=null){
				this.getOrderTrxMap().get(logicKeyVal).add(srcTrxTypNm);
			}else{
				List<String> procdTrxList = new ArrayList<String>();
				procdTrxList.add(srcTrxTypNm);
				this.getOrderTrxMap().put(logicKeyVal,procdTrxList);
			}
		}
		final TransactionHeaderVO trxVO = new TransactionHeaderVO();
		trxVO.setTrxHdrId(result.getString("trxHdrId"));
		trxVO.setQueueName(result.getString("queueName"));
		trxVO.setStatus(status);
		return trxVO;
	}
}
