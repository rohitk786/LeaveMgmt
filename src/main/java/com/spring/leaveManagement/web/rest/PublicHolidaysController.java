package com.spring.leaveManagement.web.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.leaveManagement.domain.PublicHolidays;
import com.spring.leaveManagement.repository.PublicHolidaysRepository;

@RestController
@RequestMapping("/api/")
public class PublicHolidaysController {

	@Autowired
	PublicHolidaysRepository publicHolidaysRepository;
	
	@GetMapping("/publicHolidaysData")
	public List<PublicHolidays> findAll() {
		return publicHolidaysRepository.findAll();
	}

	@PostMapping("/publicHolidaysSavingData")
	public void save(@RequestBody PublicHolidays holidays) {
		publicHolidaysRepository.save(holidays);
	}

	@GetMapping("/publicHolidaysDataByid/{id}")
	public Optional<PublicHolidays> findById(@PathVariable String id) {
		return publicHolidaysRepository.findById(id);
	}
	
}
