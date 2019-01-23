package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assets")
public class AssetEngineeringService {

	@GetMapping("/getEngineering")
	public String getEngineeringInfo() {
		return "AssetEngineering";
	}
	
}
