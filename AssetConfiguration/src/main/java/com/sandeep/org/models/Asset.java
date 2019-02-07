package com.sandeep.org.models;

public class Asset {

	private String assetID;
	private String assetName;
	private int ratedPower;
	private int mEfficiency;
	private long mRatedSpeed;
	private int minRatedF;
	private int fluidDesnsity;
	private int thresholdLimit;
	private double sDiameter;
	private double dDiameter;
	private int elevationDifference;

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
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public int getRatedPower() {
		return ratedPower;
	}

	public void setRatedPower(int ratedPower) {
		this.ratedPower = ratedPower;
	}

	public int getmEfficiency() {
		return mEfficiency;
	}

	public void setmEfficiency(int mEfficiency) {
		this.mEfficiency = mEfficiency;
	}

	public long getmRatedSpeed() {
		return mRatedSpeed;
	}

	public void setmRatedSpeed(long mRatedSpeed) {
		this.mRatedSpeed = mRatedSpeed;
	}

	public int getMinRatedF() {
		return minRatedF;
	}

	public void setMinRatedF(int minRatedF) {
		this.minRatedF = minRatedF;
	}

	public int getFluidDesnsity() {
		return fluidDesnsity;
	}

	public void setFluidDesnsity(int fluidDesnsity) {
		this.fluidDesnsity = fluidDesnsity;
	}

	public int getThresholdLimit() {
		return thresholdLimit;
	}

	public void setThresholdLimit(int thresholdLimit) {
		this.thresholdLimit = thresholdLimit;
	}

	public double getsDiameter() {
		return sDiameter;
	}

	public void setsDiameter(double sDiameter) {
		this.sDiameter = sDiameter;
	}

	public double getdDiameter() {
		return dDiameter;
	}

	public void setdDiameter(double dDiameter) {
		this.dDiameter = dDiameter;
	}

	public int getElevationDifference() {
		return elevationDifference;
	}

	public void setElevationDifference(int elevationDifference) {
		this.elevationDifference = elevationDifference;
	}

	@Override
	public String toString() {
		return "Asset [assetID=" + assetID + ", assetName=" + assetName + ", ratedPower=" + ratedPower
				+ ", mEfficiency=" + mEfficiency + ", mRatedSpeed=" + mRatedSpeed + ", minRatedF=" + minRatedF
				+ ", fluidDesnsity=" + fluidDesnsity + ", thresholdLimit=" + thresholdLimit + ", sDiameter=" + sDiameter
				+ ", dDiameter=" + dDiameter + ", elevationDifference=" + elevationDifference + "]";
	}

}
