package com.sandeep.org.asset.configure.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.org.asset.configure.models.Asset;
import com.sandeep.org.asset.configure.repository.AssetConfigRepository;

@Service
public class AssetConfigService {

	@Autowired
	private AssetConfigRepository repository;
	
	@Transactional
	public Asset save(Asset asset) {
		return repository.save(asset);
	}
	
	@Transactional
	public List<Asset> getAll() {
		return repository.findAll();
	}
	
	@Transactional
	public Asset getByName(String assetID) {
		return repository.findByAssetID(assetID);
	}
	
	@Transactional
	public void delete(Asset asset) {
		repository.delete(asset);
	}
	
}
