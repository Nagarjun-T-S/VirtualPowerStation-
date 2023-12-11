package com.alpha.vps.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.vps.DataTransfer.BatteryListResponse;
import com.alpha.vps.entity.Battery;
import com.alpha.vps.entity.BatteryStatistics;
import com.alpha.vps.repository.BatteryRepository;
import com.alpha.vps.service.BatteryService;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class BatteryServiceImpl implements BatteryService {

	@Autowired
	private BatteryRepository batteryRepository;

	@Override
	public void saveBatteries(List<Battery> batteries) {
		batteryRepository.saveAll(batteries);
	}

	@Override
	public List<Battery> getBatteriesInPostcodeRange(String startPostcode, String endPostcode) {
        return batteryRepository.findByPostcodeBetween(startPostcode, endPostcode);
    }

	public BatteryStatistics getBatteryStatistics(List<Battery> batteries) {
		long totalWattCapacity = batteries.stream().mapToLong(Battery::getWattCapacity).sum();
		double averageWattCapacity = batteries.stream().mapToDouble(Battery::getWattCapacity).average().orElse(0);

		return new BatteryStatistics(totalWattCapacity, averageWattCapacity);
	}
	public BatteryListResponse getAllBatteries() {

        BatteryListResponse batteryListResponse = new BatteryListResponse();

        List<Battery> batteryList = batteryRepository.findAll();

        IntSummaryStatistics collect = batteryList.stream()
                .collect(Collectors.summarizingInt(Battery::getWattCapacity));
        batteryListResponse.setAverageCapacity(collect.getAverage());
        batteryListResponse.setCount(collect.getCount());
        batteryListResponse.setBatteryEntityList(batteryList);

        return batteryListResponse;
    }
}