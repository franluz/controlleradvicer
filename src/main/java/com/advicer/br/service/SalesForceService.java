package com.advicer.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.advicer.br.exception.NotFoundException;
import com.advicer.br.exception.RestTemplateResponseErrorHandler;
import com.advicer.br.model.request.Request;
import com.advicer.br.model.response.Response;

@Service
public class SalesForceService {
	@Autowired
	private RestTemplate restTemplate;
	private RestTemplateBuilder restTemplateBuilder;

	@Autowired
	public SalesForceService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplateBuilder = restTemplateBuilder;
		this.restTemplateBuilder.errorHandler(new RestTemplateResponseErrorHandler()).build();
	}

	public ResponseEntity<Response> getSalesforceDependences(Integer id) throws NotFoundException {
		Request request = new Request();
		request.setId(id);
		final HttpEntity<Request> entity = new HttpEntity<Request>(request);
		return restTemplate.exchange("/urlSalesForce/4242", HttpMethod.GET, entity, Response.class);
	}
}
