package com.sandeep.org.asset.configure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandeep.org.models.Asset;

@RestController
@RequestMapping("/assetConfig")
public class AssetService {

	@PostMapping("/configure")
	public String configureAsset(@RequestBody Asset asset) {
		return asset.toString();
	}
	
	@GetMapping("hello")
	public String sayHello() {
		return "Hello";
	}
	
}
