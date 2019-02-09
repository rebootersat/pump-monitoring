package com.sandeep.org.asset.engg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandeep.org.asset.engg.models.Asset;
import com.sandeep.org.asset.engg.services.AssetService;

@RestController
@RequestMapping("/assetsEngg")
public class AssetEngineeringService {

	@Autowired
	private AssetService assetService;

	@GetMapping("/getAssets")
	public List<Asset> getEnggAssets() {
		return assetService.getAssets();
	}
	
	@GetMapping("/getAsset/{assetID}")
	public Asset getAssetByID() {
		return assetService.getAssetById("PUMP01");
	}
	
	@GetMapping("getEn")
	public String hello()
	{
		return "hello";
	}
	
}
