package com.alpha.vps.entity;

import java.util.Objects;

//BatteryStatistics.java
public class BatteryStatistics {
 private long totalWattCapacity;
 private double averageWattCapacity;
 
 
public BatteryStatistics() {
	
}


public BatteryStatistics(long totalWattCapacity, double averageWattCapacity) {
	super();
	this.totalWattCapacity = totalWattCapacity;
	this.averageWattCapacity = averageWattCapacity;
}


/**
 * @return the totalWattCapacity
 */
public long getTotalWattCapacity() {
	return totalWattCapacity;
}


/**
 * @param totalWattCapacity the totalWattCapacity to set
 */
public void setTotalWattCapacity(long totalWattCapacity) {
	this.totalWattCapacity = totalWattCapacity;
}


/**
 * @return the averageWattCapacity
 */
public double getAverageWattCapacity() {
	return averageWattCapacity;
}


/**
 * @param averageWattCapacity the averageWattCapacity to set
 */
public void setAverageWattCapacity(double averageWattCapacity) {
	this.averageWattCapacity = averageWattCapacity;
}


@Override
public int hashCode() {
	return Objects.hash(averageWattCapacity, totalWattCapacity);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	BatteryStatistics other = (BatteryStatistics) obj;
	return Double.doubleToLongBits(averageWattCapacity) == Double.doubleToLongBits(other.averageWattCapacity)
			&& totalWattCapacity == other.totalWattCapacity;
}


@Override
public String toString() {
	return "BatteryStatistics [totalWattCapacity=" + totalWattCapacity + ", averageWattCapacity=" + averageWattCapacity
			+ "]";
}

 
}
