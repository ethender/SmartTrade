package org.hawks.smarttrade.core;

import org.quartz.SchedulerException;

public interface TradeJobCycle {
	

	public void tradeJobDetail(String jobName, String groupName, Class jobclass) throws SchedulerException;
	
	public void stopJobDetail(String jobName, String groupName)throws SchedulerException;

}
