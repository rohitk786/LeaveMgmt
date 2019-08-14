package com.spring.leaveManagement.service;

import java.util.List;
import java.util.Optional;

import com.spring.leaveManagement.domain.PublicHolidays;

public interface PublicHolidaysService {

	List<PublicHolidays> findAll();
	public void save(PublicHolidays holidays);
	Optional<PublicHolidays> findById(String id);
	
}
