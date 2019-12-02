package com.advicer.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.advicer.br.exception.NotFoundException;
import com.advicer.br.service.SalesForceService;

@Controller
@RequestMapping("/")
public class DefaultController {
	private final Integer CODIGO_TESTE_ID =1;
	@Autowired
	SalesForceService salesForceService;

	@RequestMapping(method = RequestMethod.GET)
	public String home() throws NotFoundException {
		salesForceService.getSalesforceDependences(CODIGO_TESTE_ID);
	   return "1";
	}

}