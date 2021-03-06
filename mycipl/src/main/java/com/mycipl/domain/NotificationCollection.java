package com.mycipl.domain;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

/**
 * A NotificationCollection.
 */
@Document(collection = "notification_collection")
public class NotificationCollection implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    
    @Field("to")
    List<String>to; 
    
    @Field("message")
    private String message;
    
    @Field( "title")
    private String title;
    
    @Field("sendingDate")
     private  Instant sendingDate;
    
    @Field("sendingTime")
    private  String sendingTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<String> getTo() {
		return to;
	}

	public void setTo(List<String> to) {
		this.to = to;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSendingDate() {
		

		   String output = null;
		if (sendingDate != null) {
			Instant instant = sendingDate.truncatedTo( ChronoUnit.SECONDS );
			output = instant.toString();
		}

		return output;
		
	}

	public void setSendingDate(Instant sendingDate) {
		this.sendingDate = sendingDate;
	}

	public String getSendingTime() {
		return sendingTime;
	}

	public void setSendingTime(String sendingTime) {
		this.sendingTime = sendingTime;
	}
	
}
