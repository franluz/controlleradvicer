package com.advicer.br;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class DefaultController {
@Autowired BarConsumerService barConsumerService;
  @RequestMapping(method = RequestMethod.GET)
  public String home() throws Exception {
    //throw new Exception();
	   barConsumerService.fetchBarById("12");
	   return "1";
  }
	
	
}