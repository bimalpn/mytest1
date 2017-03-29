/*
 * $Id: QueueNameRowMapper.java,v 1.2 2017/03/02 05:44:28 vn89873 Exp $
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;

/**
 * The Class TrxRowMapper.
 * @author 269118
 */
public class QueueNameRowMapper implements RowMapper<TransactionHeaderVO> {
	

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
		final TransactionHeaderVO trxVO = new TransactionHeaderVO();
		trxVO.setTrxHdrId(result.getString("trxHdrId"));
		trxVO.setQueueName(result.getString("queueName"));
		return trxVO;
	}
}
