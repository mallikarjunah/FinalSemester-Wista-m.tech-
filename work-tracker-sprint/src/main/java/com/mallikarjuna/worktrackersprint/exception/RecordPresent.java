package com.mallikarjuna.worktrackersprint.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "User Present Already")
public class RecordPresent extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String message;

	private String description;

	public RecordPresent() {
	}

	public RecordPresent(String message, String description) {
		super();
		this.message = message;
		this.description = description;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
