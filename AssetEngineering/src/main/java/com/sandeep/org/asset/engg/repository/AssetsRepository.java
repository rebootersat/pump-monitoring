package com.sandeep.org.asset.engg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandeep.org.asset.engg.models.Asset;

public interface AssetsRepository extends JpaRepository<Asset, String> {

	Asset findByAssetID(String assetID);

}
