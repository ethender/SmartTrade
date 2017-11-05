package org.hawks.smarttrade.core;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class TradeScheduler implements TradeJobCycle{

	
	/*
	 * constants
	 */
	private static final  String TRIGGERNAME = "SWIFTSCHEDULER";
	private static final String  GROUP = "SWIFTGROUP";
	private static final int MINUTESREPEAT = 1;
	
	/*
	 * (non-Javadoc)
	 * @see org.hawks.smarttrade.core.TradeJobCycle#tradeJobDetail(java.lang.String, java.lang.String, java.lang.Class)
	 */
	
	public TradeScheduler() throws SchedulerException {
		trigger = (Trigger)TriggerBuilder.newTrigger().withIdentity(TRIGGERNAME, GROUP).withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInMinutes(MINUTESREPEAT).repeatForever()).build();	
		
		scheduler = new StdSchedulerFactory().getScheduler();
		scheduler.start();
	}
	
	
	
	/**
	 * Job Schedule
	 */
	@SuppressWarnings("unchecked")
	public void tradeJobDetail(String jobName, String groupName, Class jobclass) throws SchedulerException {
		JobDetail job = JobBuilder.newJob(jobclass).withIdentity(new JobKey(jobName, groupName)).build();
		scheduler.scheduleJob(job, trigger);
	}

	/**
	 * UnSchedule Job
	 */
	public void stopJobDetail(String jobName, String groupName) throws SchedulerException{
		JobKey key = new JobKey(jobName, groupName);
		if(scheduler.checkExists(key)) {
			scheduler.deleteJob(key);
		}
	}

	
	/*
	 * private instance
	 */
	private Scheduler scheduler;
	private Trigger trigger;
	
}
