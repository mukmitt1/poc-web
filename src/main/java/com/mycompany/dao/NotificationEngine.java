package com.mycompany.dao;

import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import com.mycompany.controller.NotificationServiceRequest;

public class NotificationEngine {

	private static Logger logger = Logger.getLogger(NotificationEngine.class);

	
	public Integer SendNotification(NotificationServiceRequest daoRequest) {
		Integer alertNumber=null;
	
		long startTime = System.nanoTime();
		logger.info("Calling NotificationEngine for correlation Id: " + daoRequest.getCorrelationId() 
		+ ", alertType<"+ daoRequest.getMeta().getAlertType() + ">");

		Random random = new Random();
	
	
		
		try {
			Thread.sleep(2000 + random.nextInt(1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		alertNumber = random.nextInt(Integer.MAX_VALUE);
		
		long endTime = System.nanoTime();
				
		logger.info("Return NotificationEngine response for correlation Id: " + daoRequest.getCorrelationId() 
		+ ", alertType<"+ daoRequest.getMeta().getAlertType() + "> for alert number: " + alertNumber  + ", Time Taken:" + TimeUnit.NANOSECONDS.toMillis(endTime-startTime)  );

	
		return alertNumber;
		
	}
}
