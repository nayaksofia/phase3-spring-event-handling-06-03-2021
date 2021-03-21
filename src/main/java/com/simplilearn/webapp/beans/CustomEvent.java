package com.simplilearn.webapp.beans;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class CustomEvent extends ApplicationEvent {
	
  // add constructor
	public CustomEvent(Object source) {
		super(source);
	}

	public CustomEvent(CustomEventPublisher source) {
		super(source);
	}

	public String tostring() {
		return "This is a custom event" ;
	}
	
}
