package com.alpha.vps.service;

import java.util.List;


import com.alpha.vps.entity.Battery;
import com.alpha.vps.entity.BatteryStatistics;

public interface BatteryService {
    void saveBatteries(List<Battery> batteries);
    
    List<Battery> getBatteriesInPostcodeRange(String startPostcode, String endPostcode);

    BatteryStatistics getBatteryStatistics(List<Battery> batteries);

	
}