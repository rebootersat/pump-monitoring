package com.sandeep.org.asset.configure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandeep.org.asset.configure.models.Asset;

public interface AssetConfigRepository extends JpaRepository<Asset, String>{

}
