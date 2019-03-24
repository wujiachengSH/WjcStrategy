package com.wjc.Strategy;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		Date date = new Date();
		date.getTime();
		
		DateChange dateChange = new DateChange(new YMDUtil());
		System.out.println("YMD : " + dateChange.getDate(date));
		
		DateChange dateChange2 = new DateChange(new YMUtil());
		System.out.println("YM : " + dateChange2.getDate(date));
	}
	
}
