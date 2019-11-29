package com.advicer.br;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.advicer.br.exception.RestTemplateResponseErrorHandler;
import com.advicer.br.model.response.Response;

@Service
public class BarConsumerService {
	@Autowired
	private RestTemplate restTemplate;
	private RestTemplateBuilder restTemplateBuilder;
	
	@Autowired
	public BarConsumerService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplateBuilder = restTemplateBuilder;
		this.restTemplateBuilder.errorHandler(new RestTemplateResponseErrorHandler()).build();
	}
	public Response fetchBarById(String barId) {
		return restTemplate.getForObject("/bars/4242", Response.class);
	}
}
