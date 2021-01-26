package com.mycompany.controller;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.dao.NotificationEngine;

@RestController
public class WebhookNotificationController {

	static ObjectMapper objectMapper;
	
	
	private Logger logger = Logger.getLogger(WebhookNotificationController.class);

    @RequestMapping(value = "/event", method= RequestMethod.POST  )
    @ResponseStatus(value = HttpStatus.OK)
	public void processNotification(@RequestBody NotificationServiceRequest request, 
			@RequestHeader(value = "Auth", defaultValue="") String autorization) {
    	Integer alertNumber =null;
		long startTime=0L;
    	try {
    	logger.info(request);

    	Random random = new Random();
    	
    	logger.info("Received Client webhook request received for correlation Id:" +  request.getCorrelationId()
    	+ ", alertType<"+ request.getMeta().getAlertType() + ">");
     	
    	
    	NotificationEngine dao = new NotificationEngine();
    	alertNumber = dao.SendNotification(request);

		startTime = System.nanoTime();

       	logger.info("Call Client Acknowledgement API for correlation Id:" +  request.getCorrelationId()
    	+ ", alertType<"+ request.getMeta().getAlertType() +  "> for alert number: " + alertNumber  );
 
		try {
			Thread.sleep(2000 + random.nextInt(1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	}finally {
    		logger.info("Return Client Acknowledgement API for correlation Id: " + request.getCorrelationId() 
    		+ ", alertType<"+ request.getMeta().getAlertType() + "> for alert number: " + alertNumber  + ", Time Taken:" + TimeUnit.NANOSECONDS.toMillis(System.nanoTime()-startTime) );
			
		}	    	
    	
	}
	
    
    public NotificationServiceRequest generateNotificationRequest(String nsrJson) throws IOException{
    	
    	NotificationServiceRequest request = new NotificationServiceRequest();

    	JsonNode jsonNode = objectMapper.readTree(nsrJson);
    	
    	
    	return request;
    	
    }
	
}
