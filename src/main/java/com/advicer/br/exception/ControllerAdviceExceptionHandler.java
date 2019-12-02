package com.advicer.br.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdviceExceptionHandler {

	@ExceptionHandler(Exception.class)
    public void exception(Exception ex)  {
		ex.printStackTrace();
		System.out.println("Colocando na fila qualquer erro da aplicação");
	}
}
