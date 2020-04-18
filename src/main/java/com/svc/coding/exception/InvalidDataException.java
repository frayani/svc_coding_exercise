package com.svc.coding.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception Class for Data.
 * @author Farhan Rayani
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidDataException extends RuntimeException {

	public InvalidDataException(String message) {
		super(message);
	}
}
