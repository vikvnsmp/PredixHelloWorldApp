package com.example.demo;

import java.net.HttpURLConnection;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController { 
	
	private Logger logger = LoggerFactory.getLogger(MyController.class);
	
	@RequestMapping("/")
	public String test(){    
		return "Hello";
	}

}
