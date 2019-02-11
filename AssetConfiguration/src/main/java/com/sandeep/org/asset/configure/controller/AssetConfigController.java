package com.sandeep.org.asset.configure.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sandeep.org.asset.configure.models.Asset;
import com.sandeep.org.asset.configure.service.AssetConfigService;

@RestController
@RequestMapping("/assetsConfig")
public class AssetConfigController {

	@Autowired
	private AssetConfigService service;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/configure")
	public String save(@RequestBody Asset asset) {
		return service.save(asset).getAssetName();
	}
	
	@GetMapping("/getAll")
	public List<Asset> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/delete/{assetID}")
	public void delete(@PathVariable("assetID") String assetID) {
		Asset asset = new Asset();
		asset.setAssetID(assetID);
		service.delete(asset);
	}
	
	@GetMapping("/get/{assetID}")
	public Asset get(@PathVariable("assetID") String assetID) {
		return service.getByName(assetID);
	}
	
	@GetMapping("enggAssets")
	public List<Asset> getEngineeredAssets() {
		String url = "http://asset-engineering-service/assetsEngg/getAssets";
		List<Asset> enngAssets = Arrays.asList(restTemplate.getForObject(url, Asset[].class));
		List<Asset> configAssets = service.getAll();
		
		return enngAssets.stream().filter(asset -> !configAssets.contains(asset)).collect(Collectors.toList());
	}
}
