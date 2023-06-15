package br.com.exceptions;

public class SchedulingException extends Exception {

	private static final long serialVersionUID = 1L;

	public SchedulingException(String errorMessage) {
		super(errorMessage);
	}
}
