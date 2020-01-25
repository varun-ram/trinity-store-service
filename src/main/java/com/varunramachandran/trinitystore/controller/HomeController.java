package com.varunramachandran.trinitystore.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@Value("${app.version}")
	private String appVersion;
	
	@GetMapping
	public Map<String, String> getStatus() {
		Map<String, String> statusMap = new HashMap<>();
		statusMap.put("App Version", appVersion);
		return statusMap;
	}

}
