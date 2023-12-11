// BatteryController.java
package com.alpha.vps.controller;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.alpha.vps.DataTransfer.BatteryListResponse;
import com.alpha.vps.entity.Battery;
import com.alpha.vps.entity.BatteryResponse;
import com.alpha.vps.entity.BatteryStatistics;
import com.alpha.vps.service.BatteryService;

@RestController
@RequestMapping("/batteries")
public class BatteryController {
    @Autowired
    private BatteryService batteryService;

    @PostMapping("/save")
    public ResponseEntity<String> saveBatteries(@RequestBody List<Battery> batteries) {
        batteryService.saveBatteries(batteries);
        return ResponseEntity.ok("Batteries saved successfully");
    }

    @GetMapping("/getByPostcodeRange")
    public ResponseEntity<BatteryResponse> getBatteriesInPostcodeRange(
            @RequestParam String startPostcode,
            @RequestParam String endPostcode) {

        List<Battery> batteries = batteryService.getBatteriesInPostcodeRange(startPostcode, endPostcode);
        BatteryStatistics batteryStatistics = batteryService.getBatteryStatistics(batteries);

        BatteryResponse response = new BatteryResponse(
                batteries.stream().map(Battery::getName).sorted().collect(Collectors.toList()),
                batteryStatistics
        );

        return ResponseEntity.ok(response);
    }
    @GetMapping
    public ResponseEntity<BatteryListResponse> getAllBatteries() {
        return ResponseEntity.ok(batteryService.getAllBatteries());
    }
}
