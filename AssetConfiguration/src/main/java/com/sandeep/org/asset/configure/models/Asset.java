package com.sandeep.org.asset.configure.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "assets")
public class Asset {

	@Id
	@Column(name = "ASSETID")
	private String assetID;
	@Column(name = "ASSETNAME")
	private String AssetName;
	@Column(name = "RATEDPOWER")
	private double ratedPower;
	@Column(name = "MOTAREFFICIENCY")
	private double motorEfficiency;
	@Column(name = "MOTARRATEDSPEED")
	private double motarRatedSpeed;
	@Column(name = "MINRATEDFLOWOFPUMP")
	private double minRatedFlowOfPump;
	@Column(name = "WATERDENSITY")
	private double waterDensity;
	@Column(name = "THRESHOLDLIMIT")
	private double threasHoldLimit;
	@Column(name = "SUCTIONDIAMETER")
	private double suctionDiameter;
	@Column(name = "DISCHARGEDIAMETER")
	private double dischargeDiameter;
	@Column(name = "ELEVATIONDIFF")
	private double elevationDifference;
	
	public Asset() {
		super();
	}

	public String getAssetID() {
		return assetID;
	}

	public void setAssetID(String assetID) {
		this.assetID = assetID;
	}

	public String getAssetName() {
		return AssetName;
	}

	public void setAssetName(String assetName) {
		AssetName = assetName;
	}

	public double getRatedPower() {
		return ratedPower;
	}

	public void setRatedPower(double ratedPower) {
		this.ratedPower = ratedPower;
	}

	public double getMotorEfficiency() {
		return motorEfficiency;
	}

	public void setMotorEfficiency(double motorEfficiency) {
		this.motorEfficiency = motorEfficiency;
	}

	public double getMotarRatedSpeed() {
		return motarRatedSpeed;
	}

	public void setMotarRatedSpeed(double motarRatedSpeed) {
		this.motarRatedSpeed = motarRatedSpeed;
	}

	public double getMinRatedFlowOfPump() {
		return minRatedFlowOfPump;
	}

	public void setMinRatedFlowOfPump(double minRatedFlowOfPump) {
		this.minRatedFlowOfPump = minRatedFlowOfPump;
	}

	public double getWaterDensity() {
		return waterDensity;
	}

	public void setWaterDensity(double waterDensity) {
		this.waterDensity = waterDensity;
	}

	public double getThreasHoldLimit() {
		return threasHoldLimit;
	}

	public void setThreasHoldLimit(double threasHoldLimit) {
		this.threasHoldLimit = threasHoldLimit;
	}

	public double getSuctionDiameter() {
		return suctionDiameter;
	}

	public void setSuctionDiameter(double suctionDiameter) {
		this.suctionDiameter = suctionDiameter;
	}

	public double getDischargeDiameter() {
		return dischargeDiameter;
	}

	public void setDischargeDiameter(double dischargeDiameter) {
		this.dischargeDiameter = dischargeDiameter;
	}

	public double getElevationDifference() {
		return elevationDifference;
	}

	public void setElevationDifference(double elevationDifference) {
		this.elevationDifference = elevationDifference;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assetID == null) ? 0 : assetID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asset other = (Asset) obj;
		if (assetID == null) {
			if (other.assetID != null)
				return false;
		} else if (!assetID.equals(other.assetID))
			return false;
		return true;
	}

	
	
}
