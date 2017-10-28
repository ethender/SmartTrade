package org.hawks.smarttrade.core;

import org.quartz.SchedulerException;

public class TradeTest {

	
	public TradeTest() throws SchedulerException {
		System.out.println(this.getClass().getName()+"Comming here");
		TradeScheduler scheduler = new TradeScheduler();
		scheduler.tradeJobDetail("sample", "sample", SamplePrint.class);
	}
	
	
	
}
