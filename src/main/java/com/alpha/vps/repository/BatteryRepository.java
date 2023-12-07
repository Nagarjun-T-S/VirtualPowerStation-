package com.alpha.vps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.vps.entity.Battery;

public interface BatteryRepository extends JpaRepository<Battery, Long> {
	List<Battery> findByPostcodeBetween(String startPostcode, String endPostcode);
}