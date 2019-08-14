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

import com.spring.leaveManagement.domain.LeaveHistory;
import com.spring.leaveManagement.service.LeaveHistoryService;

@RestController
@RequestMapping("/api/")
public class LeaveHistoryController {
	
	@Autowired
	LeaveHistoryService leaveHistoryService;
	
	@GetMapping("/leaveHistory")
	public List<LeaveHistory> findAll() {
		return leaveHistoryService.findAll();
	}

	@PostMapping("/leaveHistorySavingData")
	public void save(@RequestBody LeaveHistory history) {
		leaveHistoryService.save(history);
		
	}

	@GetMapping("/leaveHistoryById/{id}")
	public Optional<LeaveHistory> findById(@PathVariable String id) {
		return leaveHistoryService.findById(id);
	}

}
