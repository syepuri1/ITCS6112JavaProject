package com.event.management.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/test")
	public HashMap<String, String> sendTest()

	{
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("1", "ok");
		
		return hm;
	}

}
