package com.advicer.br.exception;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.Series.CLIENT_ERROR;
import static org.springframework.http.HttpStatus.Series.SERVER_ERROR;

import java.io.IOException;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

@Component
public class RestTemplateResponseErrorHandler implements ResponseErrorHandler {

	@Override
	public boolean hasError(ClientHttpResponse response) throws IOException {
		return (response.getStatusCode().series() == CLIENT_ERROR || response.getStatusCode().series() == SERVER_ERROR);

	}

	@Override
	public void handleError(ClientHttpResponse response) throws IOException {
		if (response.getStatusCode().series() == SERVER_ERROR) {
			System.out.println("Colocando na fila o erro do requestTemplate Server ");
		} else if (response.getStatusCode().series() == CLIENT_ERROR) {
			System.out.println("Colocando na fila o erro do requestTemplate Server ");
			if (response.getStatusCode() == NOT_FOUND) {
				throw new NotFoundException();
			}
		}

	}

}
