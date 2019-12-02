package com.advicer.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.advicer.br.service.SalesForceService;

@Controller
@RequestMapping("/")
public class DefaultController {
	@Autowired
	SalesForceService salesForceService;

	@RequestMapping(method = RequestMethod.GET)
	public String home() throws Exception {
		salesForceService.getSalesforceDependences("12");
		throw new Exception();
//	   return "1";
	}

}