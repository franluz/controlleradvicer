package com.advicer.br.exception;

import java.io.IOException;

public class NotFoundException extends IOException {

	private static final long serialVersionUID = 7238140608230048097L;

	public NotFoundException(String msg) {
		super(msg);
	}
	
	public NotFoundException(String msg, Throwable tr) {
		super(msg, tr);
	}
	
	public NotFoundException() {
	}
}
