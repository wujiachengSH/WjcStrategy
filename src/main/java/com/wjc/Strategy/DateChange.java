package com.wjc.Strategy;

import java.util.Date;

public class DateChange {

	private DateUtil dateUtil;
	
	public DateChange(DateUtil dateUtil) {
		this.dateUtil = dateUtil;
	}
	
	public String getDate(Date date) {
		return dateUtil.getDate(date);
	}
	
}
