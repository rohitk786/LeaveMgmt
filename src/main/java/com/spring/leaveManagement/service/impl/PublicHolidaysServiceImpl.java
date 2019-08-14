package com.spring.leaveManagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.leaveManagement.domain.PublicHolidays;
import com.spring.leaveManagement.repository.PublicHolidaysRepository;
import com.spring.leaveManagement.service.PublicHolidaysService;

@Service
public class PublicHolidaysServiceImpl implements PublicHolidaysService{
	
	@Autowired
	PublicHolidaysRepository publicHolidaysRepository;

	@Override
	public List<PublicHolidays> findAll() {
		return publicHolidaysRepository.findAll();
	}

	@Override
	public void save(PublicHolidays holidays) {
		publicHolidaysRepository.save(holidays);
		
	}

	@Override
	public Optional<PublicHolidays> findById(String id) {
		return publicHolidaysRepository.findById(id);
	}

}
