package com.alpha.vps.DataTransfer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

import com.alpha.vps.entity.Battery;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BatteryListResponse {

	private long count;
	private double averageCapacity;
	private List<Battery> batteryEntityList;
	
	/**
	 * @return the count
	 */
	public long getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(long count) {
		this.count = count;
	}
	/**
	 * @return the averageCapacity
	 */
	public double getAverageCapacity() {
		return averageCapacity;
	}
	/**
	 * @param averageCapacity the averageCapacity to set
	 */
	public void setAverageCapacity(double averageCapacity) {
		this.averageCapacity = averageCapacity;
	}
	/**
	 * @return the batteryEntityList
	 */
	public List<Battery> getBatteryEntityList() {
		return batteryEntityList;
	}
	/**
	 * @param batteryEntityList the batteryEntityList to set
	 */
	public void setBatteryEntityList(List<Battery> batteryEntityList) {
		this.batteryEntityList = batteryEntityList;
	}
	@Override
	public int hashCode() {
		return Objects.hash(averageCapacity, batteryEntityList, count);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BatteryListResponse other = (BatteryListResponse) obj;
		return Double.doubleToLongBits(averageCapacity) == Double.doubleToLongBits(other.averageCapacity)
				&& Objects.equals(batteryEntityList, other.batteryEntityList) && count == other.count;
	}
	@Override
	public String toString() {
		return "BatteryListResponse [count=" + count + ", averageCapacity=" + averageCapacity + ", batteryEntityList="
				+ batteryEntityList + "]";
	}
	
}