package com.alpha.vps.entity;

import java.util.List;
import java.util.Objects;

//BatteryResponse.java
public class BatteryResponse {
 private List<String> sortedBatteryNames;
 private BatteryStatistics batteryStatistics;
 
 
public BatteryResponse() {
	
}


public BatteryResponse(List<String> sortedBatteryNames, BatteryStatistics batteryStatistics) {
	super();
	this.sortedBatteryNames = sortedBatteryNames;
	this.batteryStatistics = batteryStatistics;
}


/**
 * @return the sortedBatteryNames
 */
public List<String> getSortedBatteryNames() {
	return sortedBatteryNames;
}


/**
 * @param sortedBatteryNames the sortedBatteryNames to set
 */
public void setSortedBatteryNames(List<String> sortedBatteryNames) {
	this.sortedBatteryNames = sortedBatteryNames;
}


/**
 * @return the batteryStatistics
 */
public BatteryStatistics getBatteryStatistics() {
	return batteryStatistics;
}


/**
 * @param batteryStatistics the batteryStatistics to set
 */
public void setBatteryStatistics(BatteryStatistics batteryStatistics) {
	this.batteryStatistics = batteryStatistics;
}


@Override
public int hashCode() {
	return Objects.hash(batteryStatistics, sortedBatteryNames);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	BatteryResponse other = (BatteryResponse) obj;
	return Objects.equals(batteryStatistics, other.batteryStatistics)
			&& Objects.equals(sortedBatteryNames, other.sortedBatteryNames);
}


@Override
public String toString() {
	return "BatteryResponse [sortedBatteryNames=" + sortedBatteryNames + ", batteryStatistics=" + batteryStatistics
			+ "]";
}


}
