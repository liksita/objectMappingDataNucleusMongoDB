package com.haw_hamburg.de.objectMapping.dataNucleus.entities;

import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public abstract class Activity {
	
	String id;

	Date date;
	
	User author;

	// constructors, getters and setters...

	public Activity(Date date) {
		this.date = date;
	}

	public abstract String getId();

	public abstract void setId(String id);

	public abstract Date getDate();

	public abstract void setDate(Date date);

	public abstract User getAuthor();

	public abstract void setAuthor(User author);


}
