package com.sandeep.org.asset.engg.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.org.asset.engg.models.Asset;
import com.sandeep.org.asset.engg.repository.AssetsRepository;

@Service
public class AssetService {

	@Autowired
	private AssetsRepository assetRepository;
	
	@Transactional
	public List<Asset> getAssets() {
		return assetRepository.findAll();	
	}
	
	@Transactional
	public Asset getAssetById(String assetID) {
		return assetRepository.findByAssetID(assetID);
	}
	
}
