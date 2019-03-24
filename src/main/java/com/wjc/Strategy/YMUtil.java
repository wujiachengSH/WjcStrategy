package com.wjc.Strategy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class YMUtil implements DateUtil {

	@Override
	public String getDate(Date date) {
		SimpleDateFormat sdfd =new SimpleDateFormat("yyy-MM");
		return sdfd.format(date);
	}

	
}
