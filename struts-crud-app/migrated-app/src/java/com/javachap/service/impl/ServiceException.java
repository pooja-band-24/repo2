package com.javachap.service.impl;

public class ServiceException extends RuntimeException {

	private static final long serialVersionUID = 2301643675735660187L;

	public ServiceException() {
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}
}