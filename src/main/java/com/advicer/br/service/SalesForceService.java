package com.advicer.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.advicer.br.exception.RestTemplateResponseErrorHandler;
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
	public Response getSalesforceDependences(String barId) {
		return restTemplate.getForObject("/urlSalesForce/4242", Response.class);
	}
}
